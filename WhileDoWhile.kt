
/**
 * Program name: Usage Of While, Do-while Loops in Kotlin
 * Date: 07/08/2021
 * Author: Safarov Otamurod
 */

fun main() {

    //Simple For Loop
    println("For Loop")
    for(i in 1..5){ //default step = 1, increasing
        println("Counter $i")
    }
    //While Loop
    println("While Loop")
    var i = 1
    while(i <= 5){ //step = 2, increasing
        println("Counter $i")
        i += 2
    }
    //Do While Loop
    println("Do While Loop")
    do{ //decreasing
        println("Counter $i")
        i -= 3
    }while (i >= 1)

}