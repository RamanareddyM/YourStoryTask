package com.twitter.hashtag;

import android.app.Application;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

import static com.twitter.hashtag.utils.AppConstants.TWITTER_KEY;
import static com.twitter.hashtag.utils.AppConstants.TWITTER_SECRET;

/**
 * Created by ramanaredddy on 22/09/16.
 */

public class ApplicationController extends Application{


    @Override
    public void onCreate() {

        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        super.onCreate();



    }
}
