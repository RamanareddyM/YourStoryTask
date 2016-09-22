package com.twitter.hashtag.network;

import com.twitter.hashtag.utils.AppConstants;
import com.twitter.hashtag.utils.Authenticated;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

import static com.twitter.sdk.android.core.internal.scribe.ScribeConfig.BASE_URL;


/**
 * Created by ramanaredddy on 22/09/16.
 */
public class RetrofitApi {

    private static ApiService apiServiceInterface;
    public static Retrofit retrofit;

    public static ApiService getApi() {

        if (apiServiceInterface == null) {

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(logging);

            /*
             *  initialize Retrofit
             */
                     retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                     .client(httpClient.build())
                    .build();

            apiServiceInterface = retrofit.create(ApiService.class);
        }
        return apiServiceInterface;
    }


    public interface ApiService {


        @FormUrlEncoded
        @Headers("Content-Type: application/x-www-form-urlencoded;charset=UTF-8")
        @POST("oauth2/token")
        Call<Authenticated> getTokenInfo(@Header("Authorization") String authorHeader
                , @Field("grant_type") String grantType);

        @GET(AppConstants.SEARCH_URL+"?result_type=recent")
        Call<ResponseBody> getSearchResult(@Header("Authorization") String authorHeader
                , @Query("q") String key, @Query("lang") String lang, @Query("geocode") StringBuilder geocode);

        @GET
        Call<ResponseBody> getPaginationResult(@Header("Authorization") String authorHeader, @Url String nextURL);



    }

}
