package com.cer.imgurapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.cer.imgurapp.databinding.GridViewItemBinding

class PhotoGridAdapter : ListAdapter<ImgurModel, PhotoGridAdapter.ImgurPropertyViewHolder>(DiffCallback) {
    class ImgurPropertyViewHolder(private var binding: GridViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(imgurProperty: ImgurModel){
            binding.property = imgurProperty
            binding.executePendingBindings()
        }

    }

    companion object DiffCallback : DiffUtil.ItemCallback<ImgurModel>(){
        override fun areItemsTheSame(oldItem: ImgurModel, newItem: ImgurModel): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: ImgurModel, newItem: ImgurModel): Boolean {
            return oldItem.data == newItem.data
        }

    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoGridAdapter.ImgurPropertyViewHolder {
        return PhotoGridAdapter.ImgurPropertyViewHolder(GridViewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: PhotoGridAdapter.ImgurPropertyViewHolder, position: Int) {
       val imgurProperty = getItem(position)
        holder.bind(imgurProperty)
    }


}


