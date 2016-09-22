package com.twitter.hashtag.utils;

/**
 * Created by ramanaredddy on 22/09/16.
 */

public class AppConstants {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    public static final String TWITTER_KEY = "7V6I1OZBNoClULI57DnLb7zjM";
    public static final String TWITTER_SECRET = "GD0GHn8JHwFe8I7FYREk0Vc7cPUNeDjlIV8Rg4G6Vg5tiL1Jbm";

    //Twitter API base url
    public static final String BASE_URL = "https://api.twitter.com/";
    //Twitter API Search url
    public static final String SEARCH_URL = "1.1/search/tweets.json";
    //Twitter API Pagination url
    public static final String PAGINATION_URL = BASE_URL+SEARCH_URL;


    public static final int LOCATION_REQUEST = 999;


}
