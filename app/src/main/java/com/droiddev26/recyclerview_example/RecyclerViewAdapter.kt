package com.droiddev26.recyclerview_example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val items: ArrayList<RecyclerViewItem>) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>() {

    // Holds the views for adding it to image and text
    class RecyclerViewViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val text1: TextView = itemView.findViewById(R.id.textView)
        val text2: TextView = itemView.findViewById(R.id.textView2)
    }

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_view_item, parent, false)
        return RecyclerViewViewHolder(itemView)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {

        val ItemsViewModel = items[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel.imageResource)

        // sets the text to the textview from our itemHolder class
        holder.text1.text = ItemsViewModel.text1

        // sets the text to the textview from our itemHolder class
        holder.text2.text = ItemsViewModel.text2

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return items.size
    }


}
//class RecyclerViewAdapter(private val items): RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>() {
//    // Holds the views for adding it to image and text
//    class RecyclerViewViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
//        val imageView: ImageView = itemView.findViewById(R.id.imageView)
//        val text1: TextView = itemView.findViewById(R.id.textView)
//        val text2: TextView = itemView.findViewById(R.id.textView2)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
//        val itemView =
//            LayoutInflater.from(parent.context)
//                .inflate(R.layout.recycler_view_item, parent, false)
//        return RecyclerViewViewHolder(itemView)
//    }
//
//    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
//        var holder: RecyclerViewItem = items.get(position)
//
//        holder.imageResource.get(position)
//        holder.text1.get(position)
//        holder.text2.get(position)
//    }
//
//    override fun getItemCount(): Int {
//        return items.size
//    }
//
//}

