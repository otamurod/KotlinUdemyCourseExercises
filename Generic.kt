
/**
 * Program name: Generic(or Templete) in Kotlin
 * Date: 14/09/2021
 * Author: Safarov Otamurod
 */

//Data Template  T = <Data Type>
class UserAdmins<T, F>(credit:T, age:F){

    init {
        println(credit)
    }

    init {
        println(age)
    }

}

fun <T>display(process:T){
    println(process)
}

fun main(args: Array<String>) {

    var userAdmin = UserAdmins<String, Int>("otamurod", 22)

    display<Int>(22)
    display<String>("Process user")

}