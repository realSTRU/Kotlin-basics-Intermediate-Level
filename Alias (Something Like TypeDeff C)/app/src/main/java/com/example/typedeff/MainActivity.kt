package com.example.typedeff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

typealias byMap = MutableMap<Int, ArrayList<String>>


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aliasTypeDeff()
    }



    private fun aliasTypeDeff()
    {
        var typeOfMap : byMap = mutableMapOf()

        typeOfMap[1] = arrayListOf("Nombre", "Cesar")
        typeOfMap[2] = arrayListOf("Apellido", "Martinez")

        println(typeOfMap)
    }
}