package basics

fun main(){

    //0 is th enumber we want to start with

    val list = generateSequence(0){
    println("Calculating ${it+10}")
    it+10}
   // val list = (1..1000).toList()

    val  first10 = list.take(10).toList()

   // val withoutFirst900 = list.drop(900)

    println(first10)

   // println(withoutFirst900)
}