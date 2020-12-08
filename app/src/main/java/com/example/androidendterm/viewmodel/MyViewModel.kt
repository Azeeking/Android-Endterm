package com.example.androidendterm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidendterm.model.Post
import com.example.androidendterm.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MyViewModel(private val repository: Repository): ViewModel() {
    var myResponse: MutableLiveData<Response<Post>> = MutableLiveData()
    var myResponse2: MutableLiveData<Response<Post>> = MutableLiveData()
    var myResponse3: MutableLiveData<Response<Post>> = MutableLiveData()


    fun getPost(){
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response
        }
    }
    fun getComments(number:Int){
        viewModelScope.launch {
            val response = repository.getComments(number)
            myResponse2.value = response
        }
    }
    fun getPostbyId(number: Int){
        viewModelScope.launch {
            val response = repository.getPostbyId(number)
            myResponse3.value = response
        }
    }
}