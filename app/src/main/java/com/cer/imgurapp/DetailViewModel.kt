package com.cer.imgurapp


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cer.imgurapp.Image

//Class DetailViewModel that has a constructor of params storesProperty that inherits from StoresPropertyX and
// inherits from AndroidViewModel
class DetailViewModel(imgurProperty: Image, app: Application) : AndroidViewModel(app) {
    private val _selectedProperty = MutableLiveData<Image>()

    val selectedProperty: LiveData<Image>
        get() = _selectedProperty

    init {
        _selectedProperty.value = imgurProperty
    }
}