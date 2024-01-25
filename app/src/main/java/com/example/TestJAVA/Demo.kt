package com.example.TestJAVA

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*
class Demo {
}*/
 fun main(){
   println("work start:${Thread.currentThread().name}")
    GlobalScope.launch {
        println("work start342:${Thread.currentThread().name}")
        delay(1000)
        println("work fnished:${Thread.currentThread().name}")
    }
   Thread.sleep(2000)
    println("work stop:${Thread.currentThread().name}")

}