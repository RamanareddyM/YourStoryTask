package com.twitter.hashtag;

import android.app.Application;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

/**
 * Created by ramanaredddy on 21/09/16.
 */

public class ApplicationController extends Application{

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    public static final String TWITTER_KEY = "7V6I1OZBNoClULI57DnLb7zjM";
    public static final String TWITTER_SECRET = "GD0GHn8JHwFe8I7FYREk0Vc7cPUNeDjlIV8Rg4G6Vg5tiL1Jbm";

    @Override
    public void onCreate() {

        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        super.onCreate();



    }
}
