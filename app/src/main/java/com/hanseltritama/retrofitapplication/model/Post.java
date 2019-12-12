package com.hanseltritama.retrofitapplication.model;

import com.google.gson.annotations.SerializedName;

public class Post {

    private Integer userId;
    private Integer id;
    private String title;

    @SerializedName("body")
    private String text;

    public Integer getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
