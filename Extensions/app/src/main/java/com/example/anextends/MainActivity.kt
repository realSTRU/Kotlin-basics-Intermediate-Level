package com.example.anextends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        extensions()
    }

    private fun extensions()
    {
        val byDate = Date()

        println(byDate.customformat())
        println(byDate.formatSize)




    }
}