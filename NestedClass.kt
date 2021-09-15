
/**
 * Program name: Nested || Inner Classes in Kotlin
 * Date: 14/09/2021
 * Author: Safarov Otamurod
 */

class Outer{

    private val name:String ?= null

    class Nested{

        fun show(){
            println(name)
        }

    }

}


fun main(args: Array<String>) {

    var outer = Outer()

    var nested = Outer.Nested() //instance from Nested Class
    nested.show()
}