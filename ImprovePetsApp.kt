import java.util.*
import kotlin.collections.HashMap

/**
 * Program name: Usage Of Nested Loops in Kotlin (updated using hash map)
 * Date: 08/09/2021
 * Author: Safarov Otamurod
 */

fun main() {

    //Pets App
    var listOfUsers = HashMap<String, LinkedList<String>>() //create HashMap object
    while (true){ //continue untill user types q
        print("Enter User Name or quit(q): ")
        val name = readLine()!!.toString()
        if (name == "q" || name == "quit"){
            break //exit if user type quit(q)
        }
        print("Enter Your Country: ")
        val country = readLine()!!.toString()

        var listOfUserPets = LinkedList<String>() //list of pets
        // Add pets to the list
        do{
            print("Enter pet name or type next: ")
            val petName = readLine()!!.toString()
            if (petName != "next"){
                listOfUserPets.add(petName)
            }
        }while (petName != "next")

        listOfUsers["$name:$country"] = listOfUserPets // save key and values
    }
    //Display result

    println(":::::::::: User Info ::::::::::")
    for (key in listOfUsers.keys){
        println("Username & Country: $key")
        println(":::: Pets ::::")
        for (pet in listOfUsers[key]!!){
            println(pet)
        }
    }

}