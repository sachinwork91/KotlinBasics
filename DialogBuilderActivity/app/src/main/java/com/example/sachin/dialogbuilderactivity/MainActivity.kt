package com.example.sachin.dialogbuilderactivity

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickButton.setOnClickListener {

            var dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setTitle("A New Dialog ")
            dialogBuilder.setMessage("This is a Test Dialog Message")

            dialogBuilder.setPositiveButton("Okay", DialogInterface.OnClickListener{ dialogInterface: DialogInterface, i: Int ->

                Toast.makeText(this, "You Clicked Okay", Toast.LENGTH_SHORT ).show()

            }  )

            dialogBuilder.setNegativeButton("Cancel", DialogInterface.OnClickListener{ dialogInterface: DialogInterface, i: Int ->

                Toast.makeText(this, "You Clicked Cancel", Toast.LENGTH_SHORT ).show()

            }  )





            var actualDialog= dialogBuilder.create()
            actualDialog.show()




        }


        val dialogListner = DialogInterface.OnClickListener { dialogInterface, i ->

                when(i){

                    AlertDialog.BUTTON_POSITIVE -> {   Toast.makeText(this, "You Clicked Okay", Toast.LENGTH_SHORT ).show()
                    }

                    AlertDialog.BUTTON_NEGATIVE -> {   Toast.makeText(this, "You Clicked Cancel", Toast.LENGTH_SHORT ).show()
                    }


                }



        }
    }






}
