package com.cer.imgurapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.cer.imgurapp.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        @Suppress("UNUSED_VARIABLE")
        val application = requireNotNull(activity).application
        val binding = FragmentDetailBinding.inflate(inflater)
        binding.setLifecycleOwner(this)

        val imgurProperty = DetailFragmentArgs.fromBundle(arguments!!).selectedProperty

        val viewModelFactory = DetailViewModelFactory(imgurProperty, application)
        binding.viewModel = ViewModelProviders.of(
            this, viewModelFactory
        ).get(DetailViewModel::class.java)

        (activity as MainActivity).supportActionBar?.setTitle(imgurProperty.title)

        return binding.root


    }

    fun setImageTitle() {
    }
}