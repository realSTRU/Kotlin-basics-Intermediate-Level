package com.example.data

data class Worker(val Name: String, val Age: Int, val Work: String)
{
    var LastWork: String = ""

    public fun Equals(w2: Worker) : String
    {
        if(this == w2)
        {
            return "Son Iguales"
        }
        else
        {
            return "No son iguales"
        }
    }


    override fun toString(): String {
        return "Mi nombre es $Name tengo $Age de edad y trabajo como $Work"
    }
}

