/**
 * Program name: Swap numbers in Kotlin
 * Date: 05/08/2021
 * Author: Safarov Otamurod
 */

fun main() {

    var temp:Int

    print("Enter number 1 : ") //prompt a user to input a number
    var number1:Int = readLine()!!.toInt() //read input
    print("Enter number 2 : ") //prompt a user to input another number
    var number2:Int = readLine()!!.toInt() //read input

    //Numbers before swapping
    println("Numbers before swapping")
    println("Number1: $number1")
    println("Number2: $number2")

    //Do swapping
    temp = number1
    number1 = number2
    number2 = temp

    //Numbers after swapping
    println("Numbers after swapping")
    println("Number1: $number1")
    println("Number2: $number2")

}