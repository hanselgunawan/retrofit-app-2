package com.hanseltritama.retrofitapplication.model;

import com.google.gson.annotations.SerializedName;

public class Comment {

    private Integer postId;
    private Integer id;
    private String name;
    private String email;

    @SerializedName("body")
    private String comment;

    public Integer getPostId() {
        return postId;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getComment() {
        return comment;
    }
}
