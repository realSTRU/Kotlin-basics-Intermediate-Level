package com.example.data

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataClasses()
    }

    private fun dataClasses()
    {
        val Trabajador = Worker("Cesar", 19, "Dealers seller")
        Trabajador.LastWork = "engineering"

        val Trabajador2 = Worker("Cesar", 19, "Dealers seller")
        Trabajador.LastWork = "engineering"

        //Equals
        if( Trabajador == Trabajador2)
        {
            println("Los trabajadores son iguales")
        }
        else
        {
            println("No son iguales")
        }

        //ToString
        println(Trabajador.toString())


        //Copy
        val Trabajador3 = Trabajador2.copy(Age= 22)

        // componentN
        val (Name, Age) = Trabajador3
        println(Name)
        println(Age)

        println(Trabajador2)
        println(Trabajador.Equals(Trabajador2))
        println(Trabajador.Equals(Trabajador3))



    }
}