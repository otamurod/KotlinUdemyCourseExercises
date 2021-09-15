import java.lang.Exception

/**
 * Program name: Multi-Threading in Kotlin
 * Date: 14/09/2021
 * Author: Safarov Otamurod
 */


fun main(args: Array<String>) {

    var thread1 = MyThread("thread1")
    thread1.start() //start thread

    var thread2 = MyThread("thread2")
    thread2.start() //start thread

    var thread3 = MyThread("thread3")
    thread3.start() //start thread
    thread3.join() //wait until thread3 is done

    println("Thread is run")

}

//inherit Java Thread Class
class MyThread:Thread{
    var threadName:String = ""

    constructor(threadName:String){
        this.threadName = threadName
        println("${this.threadName} is started")
    }

    override fun run() {
        //write thread

        var count = 0
        while (count < 10){
            println("${this.threadName} -> Count: $count")
            count ++

            try {
                Thread.sleep(1000)
            }catch (ex:Exception){
                println(ex.message)
            }
        }
    }

}