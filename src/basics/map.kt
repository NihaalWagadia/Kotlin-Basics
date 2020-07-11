package basics

fun main(){
    //map()
    val list = (1..100).toList()

    val doubled = list.map { element ->element*2 }

    list.map { it*2 }

    val average = list.average()
    //it == current element
    val shifted = list.map { it - average }

    println(doubled)
    println(average)
    println(shifted)


    //flatMap()

    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    //output will be into 3 different list
    val notFlattened = nestedList.map { it.sortedDescending() }

    //output will be into single list
    val Flattened = nestedList.flatMap { it.sortedDescending() }

    println(notFlattened)
    println(Flattened)

}