package com.car.maintain


/**
 * Program name: Data Class in Kotlin
 * Date: 13/09/2021
 * Author: Safarov Otamurod
 */


data class Person(val name: String, val age:Int, val gender:String)

fun main() {
    //Create object
    val person = Person("Otamurod", 22, "male")
    //Display Info
    println("person.name: ${person.name}")
    println("person.age: ${person.age}")
    println("person.gender: ${person.gender}")

}