package com.droiddev26.recyclerview_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // getting the recyclerview by its id
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = ArrayList<RecyclerViewItem>()
        items.add(
            RecyclerViewItem(
                R.drawable.ic_baseline_sentiment_satisfied_24,
                "Hello",
                "Come in"
            )
        )
        items.add(
            RecyclerViewItem(
                R.drawable.ic_baseline_directions_bike_24,
                "Bike",
                "Bike is cool"
            )
        )
        items.add(RecyclerViewItem(R.drawable.ic_baseline_lightbulb_24, "Idea", "Bulb is an idea"))

        // This will pass the ArrayList to our Adapter
        val adapter = RecyclerViewAdapter(items)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter

    }
}