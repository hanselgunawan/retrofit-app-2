package com.hanseltritama.retrofitapplication.model;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderAPI {

//    @GET("posts")
//    Call<List<Post>> getPosts(
//           // @Query("userId") Integer userId, // Integer is nullable & int is NOT nullable
//           // @Query("userId") Integer userId2,
//            @Query("userId") Integer[] userId,
//            @Query("_sort") String sortBy,
//            @Query("_order") String orderBy
//    );

    @GET("posts")
    Call<List<Post>> getPosts(@QueryMap Map<String, String> parameters);

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId); // so retrofit knows where to put postId

    @GET
    Call<List<Comment>> getComments(@Url String url);

    @POST("posts")
    Call<Post> createPost(@Body Post post);

    @FormUrlEncoded // it will send something like userId=23&title=new%20title&body=hahaha to the server
    @POST("posts")
    Call<Post> createPost(
            @Field("userId") int userId,
            @Field("title") String title,
            @Field("body") String text
    );

    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(
            @FieldMap Map<String, String> fields
    );

    @PUT("posts/{id}") // will NOT ignore null value
    Call<Post> putPost(@Path("id") int id, @Body Post post);

    @PATCH("posts/{id}") // will ignore null value and use te=he default ones
    Call<Post> patchPost(@Path("id") int id, @Body Post post);

    @DELETE("posts/{id}") // delete an item
    Call<Void> deletePost(@Path("id") int id);

}
