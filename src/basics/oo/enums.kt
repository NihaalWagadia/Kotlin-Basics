package basics.oo


//An enum is a special "class" that represents
// a group of constants (unchangeable variables, like final variables).

enum class Direction(degree:Double){
    NORTH(0.0), SOUTH(90.0), EAST(180.0), WEST(270.0)
}

enum class Suits{
    HEARTS, SPADES, DIAMONDS, CLUBS
}

fun main(){
    val suit = Suits.SPADES

    val color = when(suit){
        Suits.SPADES, Suits.CLUBS ->"red"
        Suits.DIAMONDS, Suits.HEARTS->"Blue"
    }
    println(color)
}