package com.twitter.hashtag.utils;

/**
 * Created by ramanaredddy on 22/09/16.
 */

public class AppConstants {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    public static final String TWITTER_KEY = "FAYdfCMaB75x5dZB8xgUhmB7p";
    public static final String TWITTER_SECRET = "YZG24b0B8rJIXsFTb7CA5RrsDJVa6FkPJoa0e8zgyJhg78JJh9";

    //Twitter API base url
    public static final String BASE_URL = "https://api.twitter.com/";
    //Twitter API Search url
    public static final String SEARCH_URL = "1.1/search/tweets.json";
    //Twitter API Pagination url
    public static final String PAGINATION_URL = BASE_URL+SEARCH_URL;


    public static final int LOCATION_REQUEST = 999;


}
