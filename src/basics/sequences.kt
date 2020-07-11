package basics

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main() {
    val veryLongNumber = (1..999999L).toList()

    var sum = 0L
    var lazySum = 0L
    //you'll learn sequence

    val nonLazy = measureTimeMillis {
        sum = veryLongNumber
            .filter { it > 50 }
            .map { it * 2 }
            .take(1000)
            .sum()

    }

    val Lazy = measureTimeMillis {
        lazySum = veryLongNumber
            .asSequence()
            .filter { it > 50 }
            .map { it * 2 }
            .take(1000)
            .sum()

    }

    println("Non-lazy: $nonLazy ms, Result: $sum")
    println("Lazy: $Lazy ms, Result: $lazySum")


    //to generata a sequence
    val seq = generateSequence(1, { it + 1 })
    //println(seq.take(10).toList())


}