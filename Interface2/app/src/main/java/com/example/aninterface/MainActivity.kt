package com.example.aninterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Interface()
    }

    private fun Interface()
    {
        var Gamer = Person("Cesar", 23)

        Gamer.game = "CSGO"

        Gamer.play()
    }
}