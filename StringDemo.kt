import java.util.*

/**
 * Program name: String Demonstration in Kotlin
 * Date: 16/08/2021
 * Author: Safarov Otamurod
 */


fun main() {

    val name = readLine()!!.toString()
    val message = readLine()!!.toString()
    val allMessage = "$name $message"

    println(allMessage)
    println(allMessage.lowercase(Locale.getDefault()))
    println(allMessage.uppercase(Locale.getDefault()))
    println(message)
    print(message.trim()) //trims beginning white spaces

    val listOfTokens = message.split(" ")
    //for each loop
    for (token in listOfTokens){
        println(token)
    }

}