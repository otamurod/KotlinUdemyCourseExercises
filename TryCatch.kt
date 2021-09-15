import java.lang.Exception

/**
 * Program name: Exception Handling in Kotlin
 * Date: 14/09/2021
 * Author: Safarov Otamurod
 */


fun main(args: Array<String>) {

    try {
        print("Enter an integer: ")
        val number:Int = readLine()!!.toInt()
        val division = 100 / number
        println("Div: $division")
    }catch (ex:Exception){
        println(ex.message)
    }

    println("App is done")
}