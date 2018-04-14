package com.example.sachin.recyclerviewapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.sachin.recyclerviewapp.R.id.recyclerview_main
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException

//import okhttp3.OkHttpClient
//import okhttp3.Request
//import okhttp3.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerview_main.layoutManager = LinearLayoutManager(this)

        println(fetchJson())

    }


   fun  fetchJson(): String {
       val url = "http://api.letsbuildthatapp.com/youtube/home_feed"
       var request =  Request.Builder()
                   .url(url)
                   .build();
        var result:String=""
       var client = OkHttpClient()
       var response = client.newCall(request)
               .enqueue(object : Callback {
                   override fun onFailure(call: Call?, e: IOException?) {
                       Toast.makeText(applicationContext ,"Not able to Fetch Data", Toast.LENGTH_SHORT).show()
                   }

                   override fun onResponse(call: Call?, response: Response?) {
                     val body= response?.body()?.string()
                       result =body.toString()
                     println(body)

                     val gson = GsonBuilder().create()
                     val homeFeed = gson.fromJson(body,HomeFeed::class.java )


                      runOnUiThread {
                          recyclerview_main.adapter = MainAdapter(homeFeed)
                      }

                   }


               })


           return result
       }

}

class User(var id:Int, var name:String, var userName: String) {
}

class Video(val id: Int, val name:String, val link:String)

class HomeFeed(val user:User , val videos:List<Video>){


}





