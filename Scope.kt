/**
 * Program name: Function Polymorphism in Kotlin
 * Date: 09/09/2021
 * Author: Safarov Otamurod
 */


var name:String? = null

fun showUserInfo(){
    name = "Welcome $name"
    println(name)
}

fun main() {

    name = "Otamurod"
    println(name)

    showUserInfo()
    println(name) //updated var

}