/**
 * Program name: Lambda Expression in Kotlin
 * Date: 09/09/2021
 * Author: Safarov Otamurod
 */
//lambda expression
val sum = {number1:Int, number2:Int ->
    number1 + number2
}


fun main() {

    val addNumbers = sum(4,6)
    println("Sum of numbers: $addNumbers")

    println("List of numbers")
    val listOfNumbers = listOf(10, 20, 30, 40)
    //normal for loop
    for (number in listOfNumbers){
        println(number)
    }
    //equivalent lambda expression
    listOfNumbers.forEach{ number ->
        println(number)
    }

}