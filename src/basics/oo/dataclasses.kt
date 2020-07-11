package basics.oo


//data--> generates hashCode(), equals(), toString(), copy(), destructing operator
data class Address(val street:String, val number:Int, val postcode:String, val city:String)
    fun main(){
        val residence = Address("Main", 123,"40000", "NY")
        val residence2 = Address("Main", 123,"40000", "NY")

        println(residence)

        //referential equality
        println(residence===residence2)

        //structral equality, equals
        println(residence==residence2)

        //copy()
        val neighbor = residence.copy(number = 4242)
        println(neighbor)

        //Destructing operator
        residence.component1()
        val(street, number , _, city ) = residence
        println("$street $number  $city")


    }
