
/**
 * Program name: Usage Of Nested Loops in Kotlin
 * Date: 07/08/2021
 * Author: Safarov Otamurod
 */

fun main() {

    print("How many times you want to use the app? : ")
    val counter = readLine()!!.toInt()

    //Simple For Loop
    for(i in 1..counter){ //default step = 1, increasing
        print("Enter User Name: ")
        val name = readLine()!!.toString()
        print("Enter Your Country: ")
        val country = readLine()!!.toString()

        var subject:String = ""
        println("Enter your 3 favourite subjects")

        for (j in 1..3){
            print("Subject $j: ")
            subject += readLine()!!.toString() + " "
        }
        //Display result
        println(":::::::::: User $i Info ::::::::::")

        println("Username: $name")
        println("Country: $country")
        println("Favourite subjects: $subject")
    }

}