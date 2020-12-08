package com.example.androidendterm.repository

import com.example.androidendterm.api.RetrofitInstance
import com.example.androidendterm.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost():Response<Post>{
    return RetrofitInstance.api.getPost()
}
    suspend fun getComments(number:Int):Response<Post>{
        return RetrofitInstance.api.getComments(number)
    }

    suspend fun  getPostbyId(number: Int):Response<Post>{
        return RetrofitInstance.api.getPostbyId(number)
    }

}