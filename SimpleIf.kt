
/**
 * Program name: If statement in Kotlin
 * Date: 05/08/2021
 * Author: Safarov Otamurod
 */

fun main() {
    print("Enter your age: ")
    var age = readLine()!!.toInt()

    if (age > 30 ){
        println("You yourself can go to travel")
    }
    else{
        println("You can go to travel")
    }
}