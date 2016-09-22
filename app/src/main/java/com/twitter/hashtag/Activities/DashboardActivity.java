package com.twitter.hashtag.Activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.awareness.Awareness;
import com.google.android.gms.awareness.snapshot.LocationResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.twitter.hashtag.R;
import com.twitter.hashtag.adapters.TweetsImagesAdapter;
import com.twitter.hashtag.models.TweetModel;
import com.twitter.hashtag.network.RetrofitApi;
import com.twitter.hashtag.utils.AppConstants;
import com.twitter.hashtag.utils.Authenticated;
import com.twitter.hashtag.utils.Utils;
import com.google.android.gms.awareness.snapshot.LocationResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.Tweet;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;


public class DashboardActivity extends AppCompatActivity {


    private static final String TAG = DashboardActivity.class.getSimpleName();

    private EditText edittext;
    private Button button;
    private RecyclerView mRecyclerView;
    private GridLayoutManager gridLayoutManager;
    private TweetsImagesAdapter tweetsImagesAdapter;
    private TweetsImagesAdapter mAdapter;
    private GoogleApiClient mGoogleApiClient;
    private Geocoder geocoder;
    private String authToken;
    private StringBuilder stringBuilder = new StringBuilder();
    private static final String GRANT_TYPE = "client_credentials";
    ArrayList<TweetModel> tweetModelArrayList = new ArrayList<TweetModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initializeUI();
        setUpGoogleClient();
        checkForPermissions();

    }

    private void initializeUI(){

        edittext = (EditText) findViewById(R.id.et_search);
        button = (Button) findViewById(R.id.btn_search);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        tweetsImagesAdapter = new TweetsImagesAdapter(this,tweetModelArrayList);

        setOnClickListeners();

    }

    private void setOnClickListeners(){

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (edittext.getText().toString().trim().length() > 0) {
                    tweetModelArrayList.clear();
                    getTweetsUsingHashTag(edittext.getText().toString());
                    edittext.setText("");
                } else {
                    Toast.makeText(DashboardActivity.this, "Search cannot be empty", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    public void setUpGoogleClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addApi(Awareness.API)
                .build();
        mGoogleApiClient.connect();
        geocoder = new Geocoder(this, Locale.getDefault());

    }

    public void checkForPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED)) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                    AppConstants.LOCATION_REQUEST);
        } else {
            navigateSettings();
            getLatAndLong();
        }
    }

    public void getLatAndLong() {

            Awareness.SnapshotApi.getLocation(mGoogleApiClient)
                    .setResultCallback(new ResultCallback<LocationResult>() {
                        @Override
                        public void onResult(@NonNull LocationResult locationResult) {
                            if (locationResult.getStatus().isSuccess()) {
                                Location location = locationResult.getLocation();
                                getLatAndLongAsString(location);
                                getAccessToken();

                            }
                        }
                    });

    }

    public void getLatAndLongAsString(Location location) {
        
        stringBuilder.append(location.getLatitude());
        stringBuilder.append(",");
        stringBuilder.append(location.getLongitude());
        stringBuilder.append(",");
        stringBuilder.append("1000mi");
        
    }

    public static void printLongString(String responseType, String result) {

        int maxLogSize = 4000;
        for (int i = 0; i <= result.length() / maxLogSize; i++) {
            int start = i * maxLogSize;
            int end = (i + 1) * maxLogSize;
            end = end > result.length() ? result.length() : end;

            Log.d(TAG, responseType + i + " --> " + result.substring(start, end));
        }
    }


    public void getAccessToken() {
        String encodeApiKey=null;
        String encodeApiSecret=null;
        try {
            encodeApiKey = URLEncoder.encode(AppConstants.TWITTER_KEY, "UTF-8");
            encodeApiSecret = URLEncoder.encode(AppConstants.TWITTER_SECRET, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        Call<Authenticated> tokenDataCall = RetrofitApi.getApi().getTokenInfo("Basic "
                + Base64.encodeToString((encodeApiKey + ":" + encodeApiSecret).getBytes(), Base64.NO_WRAP), GRANT_TYPE);

        tokenDataCall.enqueue(new Callback<Authenticated>() {
            @Override
            public void success(Result<Authenticated> result) {
                authToken = result.data.getAccess_token();

            }

            @Override
            public void failure(TwitterException exception) {
                Log.d(TAG, exception.getMessage());
            }
        });


    }

    public void paginationTweets(String nextPage) {

         RetrofitApi.getApi().getPaginationResult("Bearer " + authToken, AppConstants.BASE_URL + nextPage).enqueue(new Callback<ResponseBody>() {
             @Override
             public void success(Result<ResponseBody> result) {

                 if(result.response.isSuccessful()){


                     try {
                         String responseMessage = result.data.string();

                         JSONObject jsonObject = new JSONObject(responseMessage);
                         JSONArray jsonArray = jsonObject.optJSONArray("statuses");

                         for (int i = 0; i <jsonArray.length() ; i++) {

                            JSONObject object = jsonArray.optJSONObject(i);
                             JSONObject userObject = object.optJSONObject("user");
                             TweetModel tweetModel = new TweetModel();
                             tweetModel.setImage_url(userObject.optString("profile_image_url"));
                             tweetModelArrayList.add(tweetModel);
                         }

                         tweetsImagesAdapter.notifyDataSetChanged();

                     } catch (IOException e) {
                         e.printStackTrace();
                     } catch (JSONException e) {
                         e.printStackTrace();
                     }

                 }

             }

             @Override
             public void failure(TwitterException exception) {

             }
         });
    }

    public void getTweetsUsingHashTag(String query) {

        RetrofitApi.getApi().getSearchResult("Bearer " + authToken, query, "en", stringBuilder).enqueue(new Callback<ResponseBody>() {
            @Override
            public void success(Result<ResponseBody> result) {

                Log.d(TAG,result.toString());

                if(result.response.isSuccessful()){

                    tweetModelArrayList.clear();

                    try {
                        String responseMessage = result.data.string();

                        JSONObject jsonObject = new JSONObject(responseMessage);
                        JSONArray jsonArray = jsonObject.optJSONArray("statuses");

                        for (int i = 0; i <jsonArray.length() ; i++) {

                            JSONObject object = jsonArray.optJSONObject(i);
                            JSONObject userObject = object.optJSONObject("user");
                            TweetModel tweetModel = new TweetModel();
                            tweetModel.setImage_url(userObject.optString("profile_image_url"));
                            tweetModelArrayList.add(tweetModel);
                        }
                        tweetsImagesAdapter.notifyDataSetChanged();

                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }


            }

            @Override
            public void failure(TwitterException exception) {

            }
        });

    }


    @Override
    public void onRequestPermissionsResult(final int requestCode, @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == AppConstants.LOCATION_REQUEST) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                if (!Utils.getInstance().isGPSAvailable(DashboardActivity.this)) {
                    navigateSettings();
                }
            } else {
                finish();
            }
        }
    }

    public void navigateSettings() {
        if (!Utils.getInstance().isGPSAvailable(DashboardActivity.this)) {
            Intent locationIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivity(locationIntent);
        }
    }


}
