package com.example.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        TryInheritance()
    }


    private fun TryInheritance(){
        val Dev = Programmer("Cesar", 19, "Ruby")
        val Deg = Designer("kevin", 22)

        Dev.Work()
        Dev.sayLanguage()
        Dev.GoToWork()
        Deg.Work()
        Deg.Drive()
    }
}