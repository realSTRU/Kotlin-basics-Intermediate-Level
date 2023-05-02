package com.example.anextends

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.logging.SimpleFormatter

fun Date.customformat() : String
{
    val formatter  = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", Locale.getDefault())
    return formatter.format(this)
}

val Date.formatSize : Int
    get() = this.customformat().length

