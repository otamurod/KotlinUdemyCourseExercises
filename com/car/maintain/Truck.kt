package com.car.maintain


/**
 * Program name: Inheritance in Kotlin
 * Date: 13/09/2021
 * Author: Safarov Otamurod
 */

class Truck:CarOptions{

    var subType:String? = null
    //Constructors
    constructor(type:String, model: Int, price:Double, milesDrive:Int, owner:String, subType:String): super(type, model, price, milesDrive, owner){
        this.subType = subType
    }
    constructor(type:String, model: Int, price:Double, milesDrive:Int, subType:String):super(type, model, price, milesDrive){
        this.subType = subType
    }

    //Overriding function
    override fun getCarPrice():Double{
        return this.getPrice()!! - (this.milesDrive!!.toDouble() * 15)
    }

//    fun getCarPriceWrapper():Double{ //call parent class function
//        return super.getCarPrice()
//    }

}

fun Truck.getCarPriceWrapper():Double{ //extension
    return this.getCarPrice()
}

fun main() {

    val truck1 = Truck("BMW", 2015, 10000.0, 105, "Otamurod", "Dump") //create object of a class
    println("Car Type: ${truck1.type}")
    println("Car Model: ${truck1.model}")
    println("Car Price: ${truck1.getCarPrice()}") //calls overridden function
    println("Car Price: ${truck1.getCarPriceWrapper()}") //invokes parent class function
    println("Car Model: ${truck1.milesDrive}")
    println("Car Owner: ${truck1.owner}")
    println("Car Model: ${truck1.subType}")

    //second object
    val truck2 = Truck("Ferrari", 2018, 20000.0, 10, "Garbage") //create object of a class
    println("Car Type: ${truck2.type}")
    println("Car Model: ${truck2.model}")
    println("Car Price: ${truck2.getCarPrice()}") //calls overridden function
    println("Car Price: ${truck1.getCarPriceWrapper()}") //invokes parent class function
    println("Car Model: ${truck1.milesDrive}")
    println("Car Owner: ${truck2.owner}")
    println("Car Model: ${truck1.subType}")

}