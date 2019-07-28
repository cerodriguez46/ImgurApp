package com.cer.imgurapp

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {
    // The internal MutableLiveData String that stores the most recent response
    private val _status = MutableLiveData<String>()

    // The external immutable LiveData for the response String
    val status: LiveData<String>
        get() = _status

    //Live data property
    private val _properties = MutableLiveData<Image>()

    val properties: LiveData<Image>
        get() = _properties


    init {
        getImgurImageProperties()
    }


    private fun getImgurImageProperties() {
        ImgurApi.retrofitService.getProperties().enqueue(object : Callback<List<ImgurModel>> {
            override fun onFailure(call: Call<List<ImgurModel>>, t: Throwable) {
                _response.value = "Failure: " + t.message

            }

            override fun onResponse(call: Call<List<ImgurModel>>, response: Response<List<ImgurModel>>) {
                _response.value = "Success: ${response.body()?.size} Imgur properties retrieved"
            }
        })
    }
}
