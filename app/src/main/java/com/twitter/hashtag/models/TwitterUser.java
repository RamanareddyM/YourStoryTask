package com.twitter.hashtag.models;

/**
 * Created by ramanaredddy on 22/09/16.
 */

public class TwitterUser {

    private long userId;
    private String userName;
    public  String token;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
