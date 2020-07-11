package basics.oo

abstract class Vehicle{
    open fun drive(){
        println("Driving")
    }
    abstract fun honk()
}

class Sedan : Vehicle(), Drivable{
    override fun drive() {
        super<Drivable>.drive()
    }

    override fun honk() {
        println("MOP")
    }
}

fun main(){
    val sedan = Sedan()
    sedan.drive()
    sedan.honk()
}