package basics.oo

//getter and setter
class Country (val name:String,val areaSqkn:Int){

    constructor(name: String) : this(name, 0){
      println("Cons called")
    }

    fun print()= "$name, $areaSqkn kn^2"

}

fun main(){
    val aussies = Country("Aus", 707070)
    println(aussies.name)
    println(aussies.areaSqkn)

    val spain = Country("Spain")
    println(spain.name)
    println(spain.areaSqkn)
}