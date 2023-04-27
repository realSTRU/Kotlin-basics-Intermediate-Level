package com.example.encapsulamiento

public class Visibility {


    var Name: String? = null

    fun SayName()
    {
        Name.let {
            println("Mi nombre es $it ")

        } ?: run {
            println("No tengo nombre")
        }
    }
}