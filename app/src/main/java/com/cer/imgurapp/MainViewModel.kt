package com.cer.imgurapp

import android.content.Context
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    enum class ImgurApiStatus { LOADING, ERROR, DONE }


    private val _status = MutableLiveData<ImgurApiStatus>()
    val status: LiveData<ImgurApiStatus>
        get() = _status

    //Live data property
    private val _properties = MutableLiveData<List<Image>>()

    val properties: LiveData<List<Image>>
        get() = _properties

    // Internally, we use a MutableLiveData to handle navigation to the selected property
    private val _navigateToSelectedProperty = MutableLiveData<Image>()

    // The external immutable LiveData for the navigation property
    val navigateToSelectedProperty: LiveData<Image>
        get() = _navigateToSelectedProperty


    // Create a Coroutine scope using a job to be able to cancel when needed
    private var viewModelJob = Job()

    // the Coroutine runs using the Main (UI) dispatcher
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)


    init {
        getImgurImageProperties()
    }


    private fun getImgurImageProperties() {
        coroutineScope.launch {
            // Get the Deferred object for our Retrofit request
            var getPropertiesDeferred = ImgurApi.retrofitService.getProperties("blue")
            try {
                _status.value = ImgurApiStatus.LOADING

                val listResult = getPropertiesDeferred.await()
                _status.value = ImgurApiStatus.DONE
                _properties.value = listResult.data[2].images
            } catch (e: Exception) {
                _status.value = ImgurApiStatus.ERROR
                _properties.value = ArrayList()
            }
        }

    }

    /**
     * When the [ViewModel] is finished, we cancel our coroutine [viewModelJob], which tells the
     * Retrofit service to stop.
     */
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    fun displayPropertyDetails(imgurProperty: Image) {
        _navigateToSelectedProperty.value = imgurProperty
    }

    fun displayPropertyDetailsComplete() {
        _navigateToSelectedProperty.value = null
    }

    fun retrieveUserInput(): String {
        val userInput: String
        var editTextHello = findViewById(R.id.userInput) as EditText
        return
    }
}



