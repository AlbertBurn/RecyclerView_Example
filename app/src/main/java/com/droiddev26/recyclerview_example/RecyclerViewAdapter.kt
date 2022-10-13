package com.droiddev26.recyclerview_example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>() {

    class RecyclerViewViewHolder(item View) : RecyclerView.ViewHolder(item) {
//        val imageView: ImageView = itemView.findViewById(R.id.imageView)
//        val text1: TextView = itemView.findViewById(R.id.textView)
//        val text2: TextView = itemView.findViewById(R.id.textView2)
        var imageView: ImageView? = null
        var text1: TextView? = null
        var text2: TextView? = null

        constructor(itemView: View) : super(itemView) {
            imageView = itemView.findViewById(R.id.imageView)
            text1 = itemView.findViewById(R.id.textView)
            text2 = itemView.findViewById(R.id.textView2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_view_item, parent, false)
        return RecyclerViewViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        var holder: RecyclerViewItem = items.get(position)

        holder.imageResource.get(position)
        holder.text1.get(position)
        holder.text2.get(position)
    }

    override fun getItemCount(): Int {
        return items.size
    }

}

