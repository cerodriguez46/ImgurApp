package com.cer.imgurapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.cer.imgurapp.databinding.GridViewItemBinding

/**
 * This class implements a [RecyclerView] [ListAdapter] which uses Data Binding to present [List]
 * data, including computing diffs between lists.
 */
/*
class PhotoGridAdapter : ListAdapter<Data, PhotoGridAdapter.ImgurPropertyViewHolder>(DiffCallback) {

    */
/**
 * The MarsPropertyViewHolder constructor takes the binding variable from the associated
 * GridViewItem, which nicely gives it access to the full [MarsProperty] information.
 *//*

    class ImgurPropertyViewHolder(private var binding: GridViewItemBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(imgurProperty: Data) {
            binding.= imgurProperty
            // This is important, because it forces the data binding to execute immediately,
            // which allows the RecyclerView to make the correct view size measurements
            binding.executePendingBindings()
        }
    }

    */
/**
 * Allows the RecyclerView to determine which items have changed when the [List] of [MarsProperty]
 * has been updated.
 *//*

    companion object DiffCallback : DiffUtil.ItemCallback<Data>() {
        override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Data, newItem: Data): Boolean {
            return oldItem.id == newItem.id
        }
    }

    */
/**
 * Create new [RecyclerView] item views (invoked by the layout manager)
 *//*

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ImgurPropertyViewHolder {
        return ImgurPropertyViewHolder(GridViewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    */
/**
 * Replaces the contents of a view (invoked by the layout manager)
 *//*

    override fun onBindViewHolder(holder: ImgurPropertyViewHolder, position: Int) {
        val imgurProperty = getItem(position)
        holder.bind(imgurProperty)
    }
}*/
