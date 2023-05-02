package com.example.lambda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Lambdas()
    }

    private fun Lambdas()
    {
        val byIntList = arrayListOf<Int>(1,2,3,4,5,6,7,8,9)
        println(byIntList)

        val byIntFilteringList = byIntList.filter { f ->
            println(f)
            if(f == 1)
            {
                return@filter true
            }
            f > 5
        }
        println(byIntFilteringList)

        val byFunSum = fun(x: Int, y:Int) : Int = x + y
        val byFunMult = fun(x: Int, y:Int) : Int = x * y

        byAsyncFun("Cesar") {
            println(it)
        }

        println(byFunOperation(5,10,byFunMult))
        println(byFunOperation(5,10,byFunSum))
        println(byFunOperation(10, 5 ){x, y -> x - y})


    }

    private fun byFunOperation(x: Int, y: Int, MyFun: (Int, Int) ->Int) : Int {

        return MyFun(x, y)
    }

    private fun byAsyncFun(name: String, hello : (String) -> Unit)
    {
        val byMyStringInAsyncFun = "Hello $name"

        thread {
            Thread.sleep(5000)
            hello(byMyStringInAsyncFun)
        }
        thread {
            Thread.sleep(5000)
            hello(byMyStringInAsyncFun)
        }
        thread {
            Thread.sleep(5000)
            hello(byMyStringInAsyncFun)
        }
    }
}