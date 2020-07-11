package basics.oo

import java.util.*

//creating generic class

class Timeline<E>{
    val date2Data:MutableMap<Date, E> = mutableMapOf()

    fun add(element:E){
        date2Data.put(Date(), element)
    }
    fun getLatest():E{
        return date2Data.values.last()
    }
}

fun <E> timelineOf(vararg  elements:E):Timeline<E>{
    val result = Timeline<E>()
    for(element in elements){
        result.add(element)
    }
    return result
}

fun main(){
    val timeline : Timeline<Int> = Timeline()
    timeline.add(2)
    timeline.getLatest()
    
    val timeline2: Timeline<String> = timelineOf("","","") 
}