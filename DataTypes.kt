/**
 * Program name: Data types in Kotlin
 * Date: 04/08/2021
 * Author: Safarov Otamurod
 */

fun main() {
    //String variables
    val string1 = "Hello Boss!" //val cannot be updated
    //use var to update variable in the future

    val string2:String //variable declaration
    string2 = "What can I do for you right now?" //variable definition

    println(string1 + " " + string2) //string concatenation
    //the same output
    println("$string1 $string2")

    //null safety
    var nullSafetyDemo:String? //can be updated since var, not val
    nullSafetyDemo = null
    //update variable
    nullSafetyDemo = "This is null pointer"
    print("Null pointer: ${nullSafetyDemo!!}")
}