package basics

fun main(){

    val inputRows = listOf(
        mapOf("input01.csv" to listOf(3,5,-99,7,11,660)),
        mapOf("input02.csv" to listOf(1,3,4)),
        mapOf("input03.csv" to listOf()),
        mapOf("input04.csv" to listOf(9989, 33, 14, 12, 5))
    )

    //it refers to map
    //filter the number which are not between 0 and 100 i.e not show numbers
    // if numbers are not betn 0 to 100
    //flatten is to make one list for all list
    val cleaned = inputRows.flatMap { it.values }
        .flatten()
        .filter { it in 0..100 }
        .toIntArray()
    println(cleaned.joinToString())
}