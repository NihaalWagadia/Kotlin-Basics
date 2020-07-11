package basics

fun main(){

    val list = listOf("Hello", "I", "Am", "doIng", "great")
    val containsI = listOf(false, true, false, true, false)

    //Pair<String, boolean>
    val zipped: List<Pair<String, Boolean>> = list.zip(containsI)

    val mapping = list.zip(list.map{it.contains("I")})

    println(zipped)
    println(mapping)
}