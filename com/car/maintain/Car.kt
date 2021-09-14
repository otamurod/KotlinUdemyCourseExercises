
/**
 * Program name: OOP in Kotlin
 * Date: 09/09/2021
 * Author: Safarov Otamurod
 */


package com.car.maintain

class Car(val type:String, val model: Int, val price:Double, val milesDrive:Int, val owner:String) {

    init {
        println("Object class is created")
    }
    //class functions
    fun getCarPrice():Double{
        return price - milesDrive.toDouble() * 10
    }

}

fun main() {

    val car = Car("BMW", 2015, 10000.0, 105, "Otamurod") //create object of a class
    println(car.type)
    println(car.owner)
    println(car.model)
    println(car.getCarPrice())
    //second object
    val car2 = Car("Ferrari", 2018, 20000.0, 10, "Otamurod") //create object of a class
    println(car2.type)
    println(car2.owner)
    println(car2.model)
    println(car2.getCarPrice())

    //
    val listOfCars = arrayListOf<Car>()
    listOfCars.add(car)
    listOfCars.add(car2)

    for (car in listOfCars){
        println("----______----")
        println(car.type)
        println(car.owner)
        println(car.model)
        println(car.getCarPrice())
    }

}