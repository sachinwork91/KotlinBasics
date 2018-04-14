package com.example.sachin.sharedpreferencesexample

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    lateinit var enterPref: EditText
    lateinit var enterValue: EditText
    lateinit var setPref: TextView
    lateinit var setValue: TextView
    lateinit var setPrefButton: Button
  //  lateinit var addViewsButton: Button
    lateinit var linearLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        enterPref= findViewById(R.id.enterPref)
        enterValue= findViewById(R.id.enterPrefValue)
        setPref = findViewById(R.id.setPref)
        setValue = findViewById(R.id.setValue)
        setPrefButton = findViewById(R.id.setButton)
     //   addViewsButton = findViewById(R.id.addView)
        linearLayout = findViewById(R.id.linearLayout)


        fillDatafromPreference()

        setPrefButton.setOnClickListener {

            var pref_key = enterPref.text.toString()
            var pref_value = enterValue.text.toString()

            var mypref = getSharedPreferences( "mypref", Context.MODE_PRIVATE  )

            val editor = mypref.edit()
            editor.putString("name",  pref_value)
            editor.apply()

            fillDatafromPreference()


        }


        addView
                .setOnClickListener {

            //Creating a text view
            var textView = TextView(this)
            //setting the width and Height of the Layout
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT ,
                        LinearLayout.LayoutParams.WRAP_CONTENT   )


             textView.layoutParams = params

             textView.text =  "Generated from Code"

             linearLayout.addView(textView)

             var view = layoutInflater.inflate(R.layout.sample_layout , null)

             val layout = findViewById<LinearLayout>(R.id.linearLayout)

             layout.addView(view)




        }

    }

    fun fillDatafromPreference() {
        val mypref= getSharedPreferences("mypref", Context.MODE_PRIVATE)

        val name = mypref.getString("name","")
        setPref.text = "name"
        setValue.text = name


    }







}
