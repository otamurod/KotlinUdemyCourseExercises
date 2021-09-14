/**
 * Program name: Function Overloading in Kotlin
 * Date: 09/09/2021
 * Author: Safarov Otamurod
 */

fun add(number1:Int, number2:Int):Int{
    return number1 + number2
}
fun add(number1:Int, number2:Int, number3:Int):Int{
    return number1 + number2 + number3
}
fun add(number1:Int, number2:Int, number3:Int, number4:Int):Int{
    return number1 + number2 + number3 + number4
}


fun main() {

    println(add(3, 4))
    println(add(3, 4, 5))
    println(add(3, 4, 6, 7))

}