package basics

import java.io.File

//for scoping and null
fun main(){
    //let()
    //scoping
    File("example.txt").bufferedReader().let {
        if(it.ready()){
            println(it.readLine())
        }
    }

    //working with nullables
    // ? is a saf call operation which means it can be null
    val str: String? = "Learning Kotlin"
    //let will only run if the value of str is not null
    str?.let {
        if(str.isNotEmpty()) {
            str.toLowerCase()
        }
    }
}