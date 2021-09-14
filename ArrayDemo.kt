
/**
 * Program name: Array Demonstration in Kotlin
 * Date: 16/08/2021
 * Author: Safarov Otamurod
 */


fun main() {

    println("Pets App")
    println("Enter your pets")
    val pet1 = readLine()!!.toString()
    val pet2 = readLine()!!.toString()
    val pet3 = readLine()!!.toString()

    println("Your pets using variables are:")
    println("pet1: $pet1")
    println("pet2: $pet2")
    println("pet3: $pet3")

    //App using Array
    print("Enter number of pets: ")
    val maxSize = readLine()!!.toInt()
    var listOfPets: Array<String> = Array(maxSize){""}
    println("Enter your pets")
    for (i in 0 until maxSize){
        listOfPets[i] = readLine()!!.toString()
    }
    println("Your pets using array are:")
    for (i in 0 until maxSize){
        println("Pet" + (i+1) + ": ${listOfPets[i]}")
    }


}