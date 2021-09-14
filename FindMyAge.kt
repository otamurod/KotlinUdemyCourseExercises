import java.util.*

/**
 * Program name: Find My Age App in Kotlin
 * Date: 05/08/2021
 * Author: Safarov Otamurod
 */

fun main() {

    print("Enter your year of birth: ")
    val yearOfBirth = readLine()!!.toInt() //read input
    val currentYear = Calendar.getInstance().get(Calendar.YEAR) //get current year
    //calculate age and print
    val age = currentYear - yearOfBirth
    println("Your age is $age")
}