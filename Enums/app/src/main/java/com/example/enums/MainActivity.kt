package com.example.enums

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enumPractice()
    }

    enum class Orientation{
        NORTH, SOUTH, WEST, EAST;

        fun Description() : String
        {
            return when(this)
            {
                NORTH -> "La orientacion corresponde al norte"
                SOUTH -> "La orientacion corresponde al sur"
                EAST -> "La orientacion corresponde al este"
                WEST -> "La orientacion corresponde al oeste"
            }
        }
    }

    private fun enumPractice(){

        var userOrientation : Orientation? = null

        println(userOrientation)
        userOrientation = Orientation.EAST

        println(userOrientation)
        userOrientation = Orientation.NORTH

        println("Orientation:$userOrientation")
        userOrientation = Orientation.WEST

        println("Orientation name:${userOrientation.name}")
        println("Orientation position:${userOrientation.ordinal}")
        println("Short Description in Spanish about this orientation:${userOrientation.Description()}")

    }
}