package com.cer.imgurapp

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

private const val BASE_URL = "https://api.imgur.com/3/gallery/search/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface ImgurApiService {
    @Headers("Authorization: Client-ID 137cda6b5008a7c")
    @GET("1?q=vanilla")
    fun getProperties():
            Call<String>
}

object ImgurApi {
    val retrofitService: ImgurApiService by lazy {
        retrofit.create(ImgurApiService::class.java)
    }
}