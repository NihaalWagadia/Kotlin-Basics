package basics.oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

object CountryFactory{
    val a  =4
    fun CreateCountry()=Country("AUST")
}

object DefaultClickListener:MouseAdapter(){
    override fun mouseClicked(e: MouseEvent?) {
        println("Mouse clicker")
    }
}

fun main(){
    CountryFactory.a
    CountryFactory.CreateCountry()
}