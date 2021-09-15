import java.util.*
import kotlin.collections.ArrayList

/**
 * Program name: Comparable Sort array of Objects in Kotlin
 * Date: 14/09/2021
 * Author: Safarov Otamurod
 */

class Person(var name:String, var age:Int):Comparable<Person>{

    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }

}

fun main(args: Array<String>) {

    var listOfNames = ArrayList<String>()
    listOfNames.add("otamurod")
    listOfNames.add("ilhom")
    listOfNames.add("bahodir")

    println("List before sort")
    for (name in listOfNames){ //foreach loop
        println(name)
    }

    println("List after sort")
    Collections.sort(listOfNames) //sort array elements
    for (name in listOfNames){
        println(name)
    }

    var listOfPerson = ArrayList<Person>()
    listOfPerson.add(Person("otamurod", 22))
    listOfPerson.add(Person("ilhom", 39))
    listOfPerson.add(Person("bahodir", 20))

    println("List before sort")
    for (person in listOfPerson){ //foreach loop
        println("${person.name} at ${person.age}")
    }

    println("List after sort. Sort by age in ascending order")
    Collections.sort(listOfPerson) //sort array elements
    for (person in listOfPerson){
        println("${person.name} at ${person.age}")
    }

}