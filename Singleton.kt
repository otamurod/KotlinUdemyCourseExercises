
/**
 * Program name: Singleton Design Pattern in Kotlin
 * Date: 14/09/2021
 * Author: Safarov Otamurod
 */

class Singleton {
    var name:String ?= null
    //private constructor
    private constructor(){
        println("Instance is created")
    }

    companion object{
        val instance:Singleton by lazy { Singleton() }
    }

}

fun main(args: Array<String>) {

    var singleton = Singleton.instance
    singleton.name = "otamurod"
    println(singleton.name)

    var singleton2 = Singleton.instance
    println(singleton2.name)

    var singleton3 = Singleton.instance
    println(singleton3.name)



}