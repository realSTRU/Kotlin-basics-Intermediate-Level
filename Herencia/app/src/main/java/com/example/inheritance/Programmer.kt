package com.example.inheritance

import java.util.jar.Attributes

class Programmer( Name: String, Age: Int, val Language: String): Person(Name, Age) {


    public override fun Work() {
        println("Esta persona esta programando")
    }

    fun sayLanguage()
    {
        println("$Name sabe programar en $Language")
    }
}