package basics.oo

class City{
    var name: String = ""
    get() = field
    set(value){
        if(value.isNotBlank()){
            field = value
        }
    }
    var population: Int = 0
}

fun main(){
    val berlin = City()
    berlin.name = "Berlin"
    berlin.population = 9822
}