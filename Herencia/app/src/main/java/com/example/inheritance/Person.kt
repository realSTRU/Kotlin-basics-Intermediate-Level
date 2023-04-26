package com.example.inheritance

open class Person(val Name: String, Age: Int) : Work(), Vehicle {


    open fun Work()
    {
        println("Esta persona esta trabajando")
    }

    override fun GoToWork(){
        println("Requiriendo para trabajar a $Name")

    }

    override fun Drive() {
        println("Esta persoan es capaz de desarrollar un vehiculo")
    }
}