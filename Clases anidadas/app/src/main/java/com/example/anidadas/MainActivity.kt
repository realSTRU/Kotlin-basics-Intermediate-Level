package com.example.anidadas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NestedAndInnerClasses()
    }

    private fun NestedAndInnerClasses()
    {
        var ClassTry = ByNestedAndInnerClass.ByNestedClass()
        var ClassTryInner = ByNestedAndInnerClass().ByInnerClass()

        var sum : Int = ClassTry.sum(1,89)
        var sum2 : Int = ClassTryInner.sumTwo(2)
        println(sum)
        println("la despues de introducir el numero 2 en el metodo (sumTwo) se convirtio en: $sum2")


    }
}