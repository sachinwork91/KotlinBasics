package com.example.sachin.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

/**
 * Created by Sachin on 2018-04-13.
 */
class ListAdapter(var ctx: Context, var resource : Int, var data: List<Food> )
    : ArrayAdapter<Food>(ctx, resource, data)
{

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var layoutInflater = LayoutInflater.from(ctx)

        val view: View = layoutInflater.inflate(resource,null)

        val imageView : ImageView = view.findViewById(R.id.imagevw)
        val pricetv : TextView = view.findViewById(R.id.price_text)


        val food: Food = data[position]

        imageView.setImageDrawable(ctx.resources.getDrawable(food.image))

       // imageView.setImageResource(food.image)
        pricetv.setText(food.name)

        return view
    }

}