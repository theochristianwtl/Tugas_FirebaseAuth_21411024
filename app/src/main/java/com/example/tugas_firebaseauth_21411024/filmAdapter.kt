package com.example.tugas_firebaseauth_21411024

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class filmAdapter(private val filmList: ArrayList<film>): RecyclerView.Adapter<filmAdapter.ImageViewHolder>(){

    var onItemClick : ((film) -> Unit)? = null

    class ImageViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id._image)
        val imageTitle : TextView = itemView.findViewById(R.id._title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_film,parent,
            false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val film = filmList[position]
        holder.imageView.setImageResource(film.imageSource)
        holder.imageTitle.text = film.ImageTitle

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(film)
        }
    }
}