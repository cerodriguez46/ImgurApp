package com.cer.imgurapp

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

private const val BASE_URL = "https://api.imgur.com/3/gallery/search/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface ImgurApiService {
    @Headers("Authorization: Client-ID 137cda6b5008a7c")
    @GET("1?q=vanilla")
    fun getProperties(
    ):
            Call<List<ImgurModel>>
}

object ImgurApi {
    val retrofitService: ImgurApiService by lazy {
        retrofit.create(ImgurApiService::class.java)
    }
}