/**
 * Program name: Function Polymorphism in Kotlin
 * Date: 09/09/2021
 * Author: Safarov Otamurod
 */

fun showInfo(cardID:Int){
    println("CardId: $cardID")
}

fun showInfo(name: String){
    println("Name: $name")
}

fun main() {

    showInfo("Otamurod Safarov")
    showInfo(1810069)
    
}