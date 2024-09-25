package com.example.retrofitapi


import retrofit2.http.GET
import retrofit2.Call


interface ApiInterface {

    @GET("gimme")
    fun getData(): Call<responseDataClass>
}