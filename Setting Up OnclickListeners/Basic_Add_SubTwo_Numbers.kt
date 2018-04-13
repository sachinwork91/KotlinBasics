package com.example.sachin.kotlintutorials

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var editText: EditText
    lateinit var resultText: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.name)
        resultText = findViewById(R.id.results)
        button = findViewById(R.id.okaybutton)


        button.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        val name= editText.text.toString()
        resultText.setText(name)
    }




}
