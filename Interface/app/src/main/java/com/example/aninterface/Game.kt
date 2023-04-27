package com.example.aninterface

interface Game {

    var game : String
    fun play()

    fun stream()
    {
        println("Estoy haciendo stream de un juego: $game")
    }

}