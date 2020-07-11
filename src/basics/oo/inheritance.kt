package basics.oo

open class Base
class Child:Base()

open class Shape1(val name: String){
    open fun area()=0.0
}

class Circle1(name : String, val radius:Double):Shape1(name){
    override fun area() = Math.PI*Math.pow(radius,2.0)
}

fun main(){
    val smallCircle = Circle1("Small", 2.0)
    println(smallCircle.area())
}