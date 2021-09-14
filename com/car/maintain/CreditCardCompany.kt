package com.car.maintain


/**
 * Program name: Interface in Kotlin
 * Date: 13/09/2021
 * Author: Safarov Otamurod
 */


interface CreditCardCompany{

    val cardNumber:String
    //function declaration
    fun score(age:Int)
}

class MasterCard(override val cardNumber: String) :CreditCardCompany{
    override fun score(age: Int) {
        if (age > 50){
            println("Negative")
        } else {
            println("Positive")
        }
    }

    //class can have its own functions

}

class Visa(override val cardNumber: String) :CreditCardCompany{
    override fun score(age: Int) {
        if (age > 60){
            println("Negative")
        } else {
            println("Positive")
        }
    }

    //class can have its own functions
}


fun main() {

    val visa = Visa("74262374238458")
    print("Score: ")
    visa.score(60)

    val masterCard = MasterCard("58647374242458")
    print("Score: ")
    masterCard.score(60)

}