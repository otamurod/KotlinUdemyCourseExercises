package com.car.maintain


/**
 * Program name: Find Max from Array in Kotlin
 * Date: 13/09/2021
 * Author: Safarov Otamurod
 */

fun ArrayList<Int>.findMax():Int{
    var maxNumber = 0
    for (item in this){
        if (item > maxNumber){
            maxNumber = item
        }
    }
    return maxNumber
}


fun main() {
    val listOfElements = ArrayList<Int>()
    listOfElements.add(12)
    listOfElements.add(95)
    listOfElements.add(18)
    listOfElements.add(42)
    listOfElements.add(121)
    //Display all items in the arraylist
    for (item in listOfElements){
        println(item)
    }
    //Display Max Number
    print("Max: ${listOfElements.findMax()}")

}