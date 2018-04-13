package com.example.sachin.kotlintutorials

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_add_two_numbers.*

//This activity demonstrates the use of a common Onclick Listener by the two buttons


class AddTwoNumbers : AppCompatActivity() {

   //  EditText editText;
    lateinit var num1et: EditText
    lateinit var num2et: EditText
    lateinit var resultText: TextView
    lateinit var addbutton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_two_numbers)

        num1et = findViewById(R.id.num1)
        num2et = findViewById(R.id.num2)
        resultText = findViewById(R.id.res)
        addbutton = findViewById(R.id.addbutton)


        //Adding a Listener to Add two Numbers
        var addListener = object: View.OnClickListener{
            override fun onClick(view: View?) {
                val num1 = num1et.text.toString().toInt()
                val num2 = num2et.text.toString().toInt()

                resultText.setText( (num1+num2).toString())

            }
        }

        var subListener = object: View.OnClickListener{
            override fun onClick(view: View?) {
                val num1 = num1et.text.toString().toInt()
                val num2 = num2et.text.toString().toInt()

                resultText.setText( (num1 - num2).toString())

            }
        }

        addbutton.setOnClickListener(addListener )
        subbutton.setOnClickListener(subListener)
    }


}
