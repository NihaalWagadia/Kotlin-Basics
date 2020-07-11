package basics.oo

fun Int.isEven()= (this%2==0)

fun City.isLarger() = population>10000
fun main(){
    println(5.isEven())
    val naturals = listOf(1,2,99,98,97,96)
    println(naturals.filter { it.isEven() })

    val austion = City()
    austion.name = "Austion"
    austion.population = 900000
    println(austion.isLarger())
}