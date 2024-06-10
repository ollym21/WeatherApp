package com.github.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {


    private lateinit var homeButton: Button
    private lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        homeButton = findViewById(R.id.homeButton)
        exitButton = findViewById(R.id.exitButton)

        exitButton.setOnClickListener{
            finish()
        }

        homeButton.setOnClickListener{
          val intent = Intent(this, homescreen::class.java)
        }

    }
}

class homescreen {

}
