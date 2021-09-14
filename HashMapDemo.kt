
/**
 * Program name: Hash Map Demonstration in Kotlin
 * Date: 08/09/2021
 * Author: Safarov Otamurod
 */

fun main() {
    val listOfUsers = HashMap<Int, String>() //object of HashMap
    //initialize hash map
    listOfUsers[12] = "Otamurod"
    listOfUsers[14] = "James"
    listOfUsers[16] = "Alexander"
    //print specific ID
    println("Print ID 12: ${listOfUsers[12]}")
    //override or update ID
    listOfUsers[12] = "John"
    println("After update:")
    println("Print ID 12: ${listOfUsers[12]}")
    //print all key-value pairs
    for (key in listOfUsers.keys){
        println("$key: ${listOfUsers[key]}")
    }

}