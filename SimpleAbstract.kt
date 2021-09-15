
/**
 * Program name: Abstract Class in Kotlin
 * Date: 14/09/2021
 * Author: Safarov Otamurod
 */

abstract class CreditCard(){ //abstract class

    fun CreditId():String{
        return "15495938647158634"
    }

    abstract fun newCard()

}

//inherit abstract class
class UserInfo():CreditCard(){

    fun getInfo():String{
        return CreditId()
    }
    //implement abstract fun
    override fun newCard() {
        println("New Credit Card Is Created")
    }

}

fun main(args: Array<String>) {

    val credit = UserInfo()
    println(credit.getInfo())
    credit.newCard()

}