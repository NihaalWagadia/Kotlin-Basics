package basics
import kotlin.random.Random

val PI = "HOLOLO"

fun main(){
    val stringInput = readLine()!!
    if(stringInput==null||stringInput.isEmpty()){
        println("Enter a name")
    }
    else{
        println("$stringInput Buenos Dias")
    }

   // message+name

    val name = readLine()
    val noname = if(name==null || name.isEmpty()){
        PI
    }
    else{
        name
    }

    val message = if(noname==PI){
        "NO NAME NO SHAME"
    }
    else{
        "HERE YOU ARE $noname"
    }
print(message)

    //create a list of integer from 1..100 and print the value until the value is smaller than 10
    val random : MutableList<Int> = mutableListOf()
    for(i in 1..100)
    {
        //random.add(Specified range)
        random.add(Random.nextInt(100)+1)
    }
    var i=0
    while(i<random.size && random[i]>10){
        println("$random[i]")
        i++
    }
}

