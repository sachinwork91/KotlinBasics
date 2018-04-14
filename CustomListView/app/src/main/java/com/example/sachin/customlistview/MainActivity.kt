package com.example.sachin.customlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var listview: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listview = findViewById(R.id.listview)

        var data = arrayListOf<Food>()
        data.add(Food(R.drawable.pizza,"pizza") )
        data.add(Food(R.drawable.donut, "Donut"))
        data.add(Food(R.drawable.drink, "Drink"))
        data.add(Food(R.drawable.pizza,"pizza") )
        data.add(Food(R.drawable.donut, "Donut"))
        data.add(Food(R.drawable.drink, "Drink"))

        data.add(Food(R.drawable.drink, "Drink"))
        data.add(Food(R.drawable.pizza,"pizza") )
        data.add(Food(R.drawable.donut, "Donut"))
        data.add(Food(R.drawable.drink, "Drink"))
        data.add(Food(R.drawable.drink, "Drink"))
        data.add(Food(R.drawable.pizza,"pizza") )
        data.add(Food(R.drawable.donut, "Donut"))
        data.add(Food(R.drawable.drink, "Drink"))

        val adapter= ListAdapter(this, R.layout.list_item, data)
        listview.adapter=adapter

    }
}
