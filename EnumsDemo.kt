
/**
 * Program name: Enumeration in Kotlin
 * Date: 14/09/2021
 * Author: Safarov Otamurod
 */

enum class Direction{
    NORTH, SOUTH, EAST, WEST
}


fun main(args: Array<String>) {

    var userDirection = Direction.SOUTH

    if (userDirection == Direction.NORTH){
        println("He went to the North")
    }else{
        println("I don't know where he went")
    }


}