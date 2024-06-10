package com.github.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge




class Homescreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        //declare variables used within app
        lateinit var nextButton: Button
        lateinit var exitButton: Button
        lateinit var editText: EditText
        lateinit var textView: textView
        lateinit var clearButton: Button
        lateinit var avrgButton: Button

        // create a 2 parallel arrays for the weather
        val minTemp = listOf(11, 14, 7, 10, 15, 15, 16)
        val maxtemp = listOf(24, 24, 16, 16, 23, 26, 31)

       var averagetemp=0


        fun averagetemp(value: Function<String>) {
            TODO("Not yet implemented")
        }

        @SuppressLint("SuspiciousIndentation")
        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()


            // implement a or loop to calculate temp average
            //for averagetemp {
                "${11+14+7+10+15+15+16+24+24+16+16+23+26+31/14} C"

                textView.text
            }


            //initialised buttons
            nextButton = findViewById(R.id.nextButton)
            exitButton = findViewById(R.id.exitButton)
            clearButton = findViewById(R.id.clearButton)
            avrgButton = findViewById(R.id.avrgButton)



               //functions of buttons
                nextButton.setOnClickListener {
                    val intent = Intent(this, Details::class.java)
                }

            avrgButton.setOnClickListener{
                textView.text ="$averagetemp"
            }
            exitButton.setOnClickListener {
                finish()
            }
            //clear button allows user to rewrite/correct any text of choice
            clearButton.setOnClickListener {
                editText.text.clear()

            }
        }

    }




