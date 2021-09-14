
/**
 * Program name: Food Menu using When(Switch) statement in Kotlin
 * Date: 05/08/2021
 * Author: Safarov Otamurod
 */

fun main() {
    println(":: Food Menu ::")

    println("1. Sandwich")
    println("2. Hamburger")
    println("3. Salad")

    print("Order: ")
    var foodID = readLine()!!.toInt()
    print("Amount: ")
    var amount = readLine()!!.toInt()

    when(foodID){
        1 -> {
            var price = 10.0
            when (amount) {
                in 3..5 -> {price = 8.5}
                in 6..10 -> {price = 7.0}
                else -> {price = 7.5}
            }
            price *= amount
            println("$amount Sandwich(es)")
            println("Total price after discount: $price sum")

        }
        2 -> {
            var price = 9.0
            when (amount) {
                in 3..5 -> {price = 7.5}
                in 6..10 -> {price = 7.0}
                else -> {price = 6.0}
            }
            price *= amount
            println("$amount Hamburger(s)")
            println("Total price after discount: $price sum")
        }
        3 -> {
            var price = 6.0
            when (amount) {
                in 3..5 -> {price = 5.5}
                in 6..10 -> {price = 5.0}
                else -> {price = 4.0}
            }
            price *= amount
            println("$amount Salad")
            println("Total price after discount: $price sum")
        }
        else -> {
            println("Nothing ordered")
        }
    }
}