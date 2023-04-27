package com.example.aninterface

open class Person (Name: String, Age:Int) : Game {

    override var game: String= "Valorant"

    override fun play() {
        println("Estoy jugando a $game")
    }




}