/**
 * Program name: Read inputs in Kotlin
 * Date: 05/08/2021
 * Author: Safarov Otamurod
 */

fun main() {
    print("Input your name: ") //prompt a user to input his/her name
    val name:String = readLine()!!.toString() //read input
    print("Input your age: ") //prompt a user to input his/her age
    val age:Int = readLine()!!.toInt() //read input
    //Display user info
    println("Your name: $name")
    println("Your age: $age")

}