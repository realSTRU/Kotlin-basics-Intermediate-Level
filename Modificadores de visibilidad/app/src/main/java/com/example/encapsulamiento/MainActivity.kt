package com.example.encapsulamiento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Visible()
    }

    private fun Visible()
    {
        var byVisibility = Visibility()
        byVisibility.Name = "Gabriel"
        byVisibility.SayName()
    }
}