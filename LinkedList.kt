import java.util.*

/**
 * Program name: Linked List Demonstration in Kotlin
 * Date: 07/09/2021
 * Author: Safarov Otamurod
 */


fun main() {

    //App using Linked List

    var listOfPets = LinkedList<String>()
    println("Enter your pets or quit(q)")
    do{
        val petName = readLine()!!.toString()
        if (petName != "q"){
            listOfPets.add(petName)
        }
    }while (petName != "q")

    println("Your pets are displayed using array list(index):")
    for (i in 0 until listOfPets.size){
        println("Pet" + (i+1) + ": ${listOfPets[i]}")
    }
    println("Your pets are displayed using array list(object):")
    for (pet in listOfPets){
        println("Pet: $pet")
    }

    if (listOfPets.contains("horse")){
        println("Your horse is qualified for special care")
    }

}