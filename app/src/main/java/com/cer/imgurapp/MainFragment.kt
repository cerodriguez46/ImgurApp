package com.cer.imgurapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.cer.imgurapp.databinding.FragmentMainBinding
import com.cer.imgurapp.databinding.GridViewItemBinding
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {


    /**
     * Lazily initialize our [OverviewViewModel].
     */
    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    /**
     * Inflates the layout with Data Binding, sets its lifecycle owner to the OverviewFragment
     * to enable Data Binding to observe LiveData, and sets up the RecyclerView with an adapter.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //(activity as MainActivity).supportActionBar?.setTitle(viewModel.input.toString())
        val binding = FragmentMainBinding.inflate(inflater)




        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment
        binding.setLifecycleOwner(this)

        // Giving the binding access to the OverviewViewModel
        binding.viewModel = viewModel
        binding.photosGrid.adapter = PhotoGridAdapter(PhotoGridAdapter.OnClickListener {
            viewModel.displayPropertyDetails(it)
        })


        viewModel.navigateToSelectedProperty.observe(this, Observer {
            if (null != it) {
                this.findNavController().navigate(MainFragmentDirections.actionShowDetail(it))
                viewModel.displayPropertyDetailsComplete()
            }
        })

        Log.d("errors", viewModel.input.toString())

        binding.searchMagnify.setOnClickListener { }

        setHasOptionsMenu(true)
        return binding.root
    }

    /* fun retrieveUserInput(): String {
         val userInput: String?
         searchInput
         return userInput
     }*/


}