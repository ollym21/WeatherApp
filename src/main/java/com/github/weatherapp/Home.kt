package com.github.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge

class textView {

    lateinit var text: String

    companion object {
        lateinit var text: String
    }
}



class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        //declar variables used within app
        lateinit var nextButton: Button
        lateinit var exitButton: Button
        lateinit var editText: EditText
        lateinit var textView: textView
        lateinit var clearButton: Button

        // create a 3 parallel arrays for the weather
        val minTemp = intArrayOf(11, 14, 7, 10, 15, 15, 16)
        val hightemp = intArrayOf(24, 24, 16, 16, 23, 26, 31)
        //var weathercondition = mutableListOf<String>(sunny, partly cloudy, raining, cold, sunny, sunny, hot)
        //val avrtemperate

        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()



            //funtion to if text is empty && invalid
           // fun EditText.isEmpty(): Boolean {
                //editText = ""

                nextButton = findViewById(R.id.nextButton)
                exitButton = findViewById(R.id.exitButton)
                clearButton = findViewById(R.id.clearButton)




                //initialised buttons
                nextButton.setOnClickListener {
                    val intent = Intent(this, Details::class.java)


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
    }







