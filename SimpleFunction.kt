
/**
 * Program name: Usage of Function in Kotlin
 * Date: 08/09/2021
 * Author: Safarov Otamurod
 */

/**
 * define a new function
 * i.e: fun fun_Name(arg1:DataType, arg2:DataType):returnType{ statement }
*/

fun addNumbers(x:Double, y:Double){ //function without return type(like void)
    val temp = x + y
    println("$x + $y = $temp")
}
//function with default arguments
fun add(x:Double = 0.0, y:Double = 0.0):Double{ //function with return type Double
    val sum = x + y
    return sum
}

fun displayInfo(vararg names:String){
    for (name in names){
        println(name)
    }
}

fun main() {
    //invoke a function
    addNumbers(4.0, 6.0)
    var sum = add(5.0, 10.0)
    println("Sum = $sum")
    sum = add(8.0) //y = 0.0 by default
    println("Sum = $sum")
    sum = add(x = 5.0, y = 10.0) //another way of passing parameters
    println("Sum = $sum")
    sum = add(y = 10.0) //x = 0.0
    println("Sum = $sum")

    //passing array of arguments
    displayInfo(names = arrayOf("otamurod", "sardor", "bobur"))

}