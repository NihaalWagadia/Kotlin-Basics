package basics

fun main(){
    //one argument
    val timesTwo = {x: Int -> x*2}

        //two arguments for adding two numbers
    //-> returns int
    val add:(Int, Int)-> Int = {x: Int, y:Int -> x+y}

    //generate 1 to 100 number
    val list = (1..100).toList()

    println(list.filter { element -> element % 2 == 0 })

    //it == current element
    println(list.filter { it % 2 == 0 })

    println(list.filter { it.even() })

    println(list.filter(::isEven))



}

fun Int.even() = this%2==0

fun isEven(i:Int)=i%2==0