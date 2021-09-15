import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

/**
 * Program name: File Operations in Kotlin
 * Date: 14/09/2021
 * Author: Safarov Otamurod
 */

fun main(args: Array<String>) {

    println("1. Read\n2. Write\n") //Menu
    val operation = readLine()!!.toInt()

    when(operation){ //do operation chosen
        1 -> {
            readFromFile()
        }
        2 -> {
            print("Write to file: ")
            var string = readLine()!!.toString()
            writeToFile(string)
        }

    }

}

fun writeToFile(str:String){ //function to write to a file

    try{
        val fileOut = FileWriter("test.txt", true)  //if file exists, append data in it
        fileOut.write(str + "\n")
        fileOut.close()
        println("Data is saved")
    }catch (ex:Exception){ //catch if there is an error
        println(ex.message)
    }

}

fun readFromFile(){ //function to read from a file

    try {

        val fileIn = FileReader("test.txt") //select a file to read
        var c:Int?
        do{

            c = fileIn.read() //whenever there is a data, c is not -1
            print(c.toChar())

        }while (c != -1)

    }catch (ex:Exception){
        println(ex.message)
    }

}