package com.car.maintain


/**
 * Program name: OOP in Kotlin
 * Date: 09/09/2021
 * Author: Safarov Otamurod
 */

open class CarOptions(){

    var type:String? = null
    var model:Int? = null
    var price:Double? = null
    var owner:String? = null
    var milesDrive:Int? = 0

    constructor(type:String, model: Int, price:Double, milesDrive:Int, owner:String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.owner = owner
        this.milesDrive = milesDrive
    }
    constructor(type:String, model: Int, price:Double, milesDrive:Int):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
    }

    init { //constructor
        println("Object class is created")
    }
    //class functions
    open fun getCarPrice():Double{
        return this.price!! - (this.milesDrive!!.toDouble() * 10)
    }
    fun getPrice():Double{
        return this.price!!
    }


}

fun main() {

    val car1 = CarOptions("BMW", 2015, 10000.0, 105, "Otamurod") //create object of a class
    println("Car Type: ${car1.type}")
    println("Car Owner: ${car1.owner}")
    println("Car Model: ${car1.model}")
    println("Car Price: ${car1.getCarPrice()}")
    //second object
    val car2 = CarOptions("Ferrari", 2018, 20000.0, 10) //create object of a class
    println("Car Type: ${car2.type}")
    println("Car Owner: ${car2.owner}")
    println("Car Model: ${car2.model}")
    println("Car Price: ${car2.getCarPrice()}")

    //
    val listOfCars = arrayListOf<CarOptions>()
    listOfCars.add(car1)
    listOfCars.add(car2)

    for (car in listOfCars){
        println("----______----")
        println("Car Type: ${car.type}")
        println("Car Owner: ${car.owner}")
        println("Car Model: ${car.model}")
        println("Car Price: ${car.getCarPrice()}")
    }

}