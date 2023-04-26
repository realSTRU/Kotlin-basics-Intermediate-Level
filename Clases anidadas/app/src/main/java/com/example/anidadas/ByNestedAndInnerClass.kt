package com.example.anidadas

class ByNestedAndInnerClass {

    private val One = 1

    private fun ReturnOne(): Int{
        return One
    }

    class ByNestedClass{


        fun sum(First: Int, Second: Int) : Int
        {
            return First + Second
        }
    }

    inner class ByInnerClass{
        fun sumTwo(Number:  Int) : Int{
            return One+ Number
        }
    }
}