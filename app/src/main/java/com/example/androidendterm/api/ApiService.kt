package com.example.androidendterm.api

import com.example.androidendterm.model.Post
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("posts/")
    suspend fun getPost():Response<Post>

    @GET("posts/{id}/")
    suspend fun getPostbyId(
        @Path("id") number: Int
    ):Response<Post>

    @GET("comments?postId={id}")
    suspend fun getComments(
       @Path("id") number: Int
    ):Response<Post>

}