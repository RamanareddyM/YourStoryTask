package com.twitter.hashtag.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.LocationManager;

import com.twitter.hashtag.ApplicationController;

/**
 * Created by ramanaredddy on 22/09/16.
 */

public class Utils {

    private static Utils instance = null;
    private static  final String ACCESS_TOKEN = "access_token";


    public static Utils getInstance() {
        if (instance == null) {
            instance = new Utils();
        }
        return instance;
    }

    public boolean isGPSAvailable(Activity activity) {
        LocationManager locationManager = (LocationManager) activity.getSystemService(Context.LOCATION_SERVICE);
        return !(!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
                && !locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER));
    }

    public void setAccessToken(Activity  activity,String auth){

        SharedPreferences sharedPref = activity.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(ACCESS_TOKEN, auth);
        editor.commit();


    }

    public String getAccessToken(Activity  activity){

        SharedPreferences sharedPref = activity.getPreferences(Context.MODE_PRIVATE);
        return sharedPref.getString(ACCESS_TOKEN, null);

    }

}
