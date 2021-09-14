
/**
 * Program name: Mutable vs Immutable Objects
 * Date: 08/09/2021
 * Author: Safarov Otamurod
 */

fun main() {

    /** List
     *  Immutable
     * */

    val list = listOf("otamurod", "sardor")
    //list[0] = "bobur" is impossible
    println("Immutable List")
    for(name in list){
        println(name)
    }

    /**
     * Mutable
     * */
    var listMutable = mutableListOf("otamurod", "sardor")
    listMutable[0] = "bobur"
    println("Mutable List")
    for(name in listMutable){
        println(name)
    }

    /**
     * Immutable map
     * */
    val listOfUsersI = mapOf(1 to "otamurod", 2 to "sardor")
    println("Immutable Map")

    for (key in listOfUsersI.keys){
        println("$key : ${listOfUsersI[key]}")
    }
    /**
     * Mutable map
     * */
    var listOfUsersM = mutableMapOf(1 to "otamurod", 2 to "sardor")
    listOfUsersM[2] = "bobur"
    println("Mutable Map")
    for (key in listOfUsersM.keys){
        println("$key : ${listOfUsersM[key]}")
    }
}