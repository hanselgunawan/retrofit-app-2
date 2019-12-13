package com.hanseltritama.retrofitapplication.model;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
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

}
