/**
 * Program name: Math Operations in Kotlin
 * Date: 05/08/2021
 * Author: Safarov Otamurod
 */

fun main() {
    println("Arithmetic Calculator")
    print("Enter number 1 : ") //prompt a user to input a number
    var number1:Double = readLine()!!.toDouble() //read input

    print("Enter number 2 : ") //prompt a user to input another number
    var number2:Double = readLine()!!.toDouble() //read input
    //Show math operations

    //Do summation
    println("$number1 + $number2 = " + (number1 + number2))
    //Do subtraction
    println("$number1 - $number2 = " + (number1 - number2))
    //Do multiplication
    println("$number1 * $number2 = " + (number1 * number2))
    //Do division
    println("$number1 / $number2 = " + (number1 / number2))

}