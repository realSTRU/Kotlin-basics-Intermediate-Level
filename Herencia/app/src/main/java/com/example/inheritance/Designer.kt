package com.example.inheritance

class Designer (Name: String, Age: Int): Person(Name, Age){

    public override fun Work() {
        println("Esta persona esta diseñando")
    }
}