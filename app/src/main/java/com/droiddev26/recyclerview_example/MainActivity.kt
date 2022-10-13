package com.droiddev26.recyclerview_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter as RecyclerViewAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager: RecyclerView.LayoutManager
        val adapter: RecyclerView.Adapter

        var items = ArrayList<RecyclerViewItem>()
        items.add(RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_24, "Hello", "Come in"))
        items.add(RecyclerViewItem(R.drawable.ic_baseline_directions_bike_24, "Bike", "Bike is cool"))
        items.add(RecyclerViewItem(R.drawable.ic_baseline_lightbulb_24, "Idea", "Bulb is an idea"))

    }
}