package com.example.discommponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        destructuringOption()
    }

    private fun destructuringOption()
    {
        //val (Nombre, Edad, Trabajo) = Persona("Emill", 21, "Civil engineering")

        val Person = Persona("Cesar", 19, "Programmer")

        var byMap = mapOf(1 to "C", 2 to "Kev", 3 to "Ev")

        for((id, name) in byMap)
        {
            println("$id : $name")
        }


    }
}