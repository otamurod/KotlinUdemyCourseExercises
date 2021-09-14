
/**
 * Program name: Usage Of Break and continue in Kotlin
 * Date: 07/08/2021
 * Author: Safarov Otamurod
 */

fun main() {

    println("Continue")
    for (i in 1..5){
        if (i == 3){
            continue
        }
        println("Subject $i")
    }

    println("Break")
    for (i in 1..4){
        if (i == 2){
            break
        }
        println("Subject $i")
    }

    println("Outer Break")
    outerLoop@ for (i in 1..4){
        println("User $i")
        for (j in 1..5){
            if (j == 3){
                break@outerLoop
            }
            println("Inner Loop $j")
        }
    }

    println("Inner Break")
    for (i in 1..4){
        println("User $i")
        for (j in 1..5){
            if (j == 3){
                break
            }
            println("Inner Loop $j")
        }
    }

    println("Outer Continue")
    outerLoop@ for (i in 1..4){
        println("User $i")
        for (j in 1..5){
            if (j == 3){
                continue@outerLoop
            }
            println("Inner Loop $j")
        }
    }

    println("Inner Continue")
    for (i in 1..4){
        println("User $i")
        for (j in 1..5){
            if (j == 3){
                continue
            }
            println("Inner Loop $j")
        }
    }

}