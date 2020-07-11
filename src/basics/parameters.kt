package basics

fun main(){
    val together = concat(listOf("KOT","JAVA0","007"), ":")
    print(together)
}
fun concat(texts:List<String>, separator: String = ",  ")= texts.joinToString(separator);