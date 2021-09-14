
/**
 * Program name: Array List Demonstration in Kotlin
 * Date: 07/09/2021
 * Author: Safarov Otamurod
 */


fun main() {

    println("Pets App")
    println("Enter your pets")
    val pet1 = readLine()!!.toString()
    val pet2 = readLine()!!.toString()
    val pet3 = readLine()!!.toString()

    println("Your pets are displayed using variables:")
    println("pet1: $pet1")
    println("pet2: $pet2")
    println("pet3: $pet3")

    //App using Array List

    var listOfPets = ArrayList<String>()
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