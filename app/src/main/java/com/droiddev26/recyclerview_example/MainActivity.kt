package com.droiddev26.recyclerview_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import androidx.recyclerview.widget.RecyclerView.Adapter as RecyclerViewAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // getting the recyclerview by its id
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        // this creates a vertical layout Manager
        val layoutManager = LinearLayoutManager(this)

        var items = ArrayList<RecyclerViewItem>()
        items.add(RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_24, "Hello", "Come in"))
        items.add(RecyclerViewItem(R.drawable.ic_baseline_directions_bike_24, "Bike", "Bike is cool"))
        items.add(RecyclerViewItem(R.drawable.ic_baseline_lightbulb_24, "Idea", "Bulb is an idea"))

        // This will pass the ArrayList to our Adapter
        val adapter = RecyclerViewAdapter(items)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter

//        // getting the recyclerview by its id
//        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
//
//        // this creates a vertical layout Manager
//        recyclerview.layoutManager = LinearLayoutManager(this)
//
//        // ArrayList of class ItemsViewModel
//        val data = ArrayList<ItemsViewModel>()
//
//        // This loop will create 20 Views containing
//        // the image with the count of view
//        for (i in 1..20) {
//            data.add(ItemsViewModel(R.drawable.ic_baseline_folder_24, "Item " + i))
//        }
//
//        // This will pass the ArrayList to our Adapter
//        val adapter = CustomAdapter(data)
//
//        // Setting the Adapter with the recyclerview
//        recyclerview.adapter = adapter

    }
}