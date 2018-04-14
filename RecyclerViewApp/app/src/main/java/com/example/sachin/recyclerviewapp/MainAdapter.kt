package com.example.sachin.recyclerviewapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.items_layout.view.*

/**
 * Created by Sachin on 2018-04-13.
 */
class MainAdapter(var homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder>() {

  //  var list = arrayListOf<String>("First", "Second" , "Third" , "Four")

   // var ctx = applicationContext
    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
            holder?.view?.textView2?.text= homeFeed.videos[position].name

            holder?.view?.imageView?.setOnClickListener {
                Toast.makeText( holder?.view.context ,"You selected ${position} Image ",Toast.LENGTH_SHORT).show()
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder{

        var layoutInflater = LayoutInflater.from(parent?.context)
        var view = layoutInflater.inflate(R.layout.items_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
      return  homeFeed.videos.size
    }

}

class CustomViewHolder(var view : View): RecyclerView.ViewHolder(view) {


}