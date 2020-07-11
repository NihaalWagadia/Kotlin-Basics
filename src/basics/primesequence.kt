package basics

fun main() {
    val possiblePrimeAfter2 = generateSequence(3) { it + 2 }
    val primes = generateSequence(2 to possiblePrimeAfter2) {

        //next prime number
        //it.second is the sequence i.e 3,5,7,9,10
        //first is the first element in the sequence which is 3
        val p = it.second.first()

        //filter out elements divisible by p
        val possiblePrimeAfterP = it.second.filter { it % p != 0 }
        p to possiblePrimeAfterP
    }.map { it.first }

    println(primes.take(20).toList())
}