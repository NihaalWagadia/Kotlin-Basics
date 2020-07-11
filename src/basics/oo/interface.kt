package basics.oo


//interface does not have constructor
interface Drivable{
    fun drive(){
        println("Driving")

    }

}

class Bicycle:Drivable{
    override fun drive() {
        println("Drive bi")
    }
}


class Boat:Drivable{
    override fun drive() {
        println("Drive boat")
    }
}

fun main(){
    val drivable:Drivable=Bicycle()
    drivable.drive()
}