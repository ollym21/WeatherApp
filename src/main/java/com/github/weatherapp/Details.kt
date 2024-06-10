package com.github.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class button {

}

object string {

}



class Details : AppCompatActivity() {

    private lateinit var detailstext : textView
    private lateinit var backButtom: button

    // create a 3 parallel arrays for the weather


    //var weatherconditionArray = mutableListOf<String>(sunny, partly cloudy, raining,cold,sunny,sunny,hot)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        detailstext.text = "Monday 11C, 24C (SUNNY)" +
                "Tuesday 1C, 24C (SUNNY)" +
                "Wednesday 7C, 16C (RAINING)" +
                "Thursday 10C, 16C (CLOUDY)" +
                "Friday 15C, 23C (SUNNY)" +
                "Saturday 15C, 26C (SUNNY)" +
                "Sunday 16C, 31C (HOT)"


    }
}

//val Tuesday =
//        val Wednesday
//        val Thursday
//        val Friday
//        val Saturday
//        val Sunday


// var daysArray = arrayListOf( Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday)