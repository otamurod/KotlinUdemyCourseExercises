
/**
 * Program name: Usage Of Simple For Loop in Kotlin
 * Date: 06/08/2021
 * Author: Safarov Otamurod
 */

fun main() {

    //Simple For Loop
    println("== Increment ==")
    for(i in 1..5){ //default step = 1, increasing
        println("Hello World $i")
    }
    println("== Increment ==")
    for(i in 1..5 step 2){ //step = 2, increasing
        println("Hello World $i")
    }
    println("== Decrement ==")
    for(i in 10 downTo 2 step 2){ //decreasing
        println("Hello World $i")
    }

}