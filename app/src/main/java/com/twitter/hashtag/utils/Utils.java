package com.twitter.hashtag.utils;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;

/**
 * Created by ramanaredddy on 22/09/16.
 */

public class Utils {

    private static Utils instance = null;


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

}
