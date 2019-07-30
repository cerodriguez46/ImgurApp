package com.cer.imgurapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.cer.imgurapp.databinding.GridViewItemBinding

class PhotoGridAdapter(val onClickListener: OnClickListener) :
    ListAdapter<Image, PhotoGridAdapter.ImgurPropertyViewHolder>(DiffCallback) {
    class ImgurPropertyViewHolder(private var binding: GridViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(imgurProperty: Image) {
            binding.property = imgurProperty
            binding.executePendingBindings()
        }

    }

    companion object DiffCallback : DiffUtil.ItemCallback<Image>() {
        override fun areItemsTheSame(oldItem: Image, newItem: Image): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Image, newItem: Image): Boolean {
            return oldItem.id == newItem.id
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImgurPropertyViewHolder {
        return ImgurPropertyViewHolder(GridViewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ImgurPropertyViewHolder, position: Int) {
       val imgurProperty = getItem(position)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(imgurProperty)
        }
        holder.bind(imgurProperty)
    }

    class OnClickListener(val clickListener: (imgurProperty: Image) -> Unit) {
        fun onClick(imgurProperty: Image) = clickListener(imgurProperty)
    }
}


