package basics.oo

class Source<out T>(val t: T){
    fun produceT():T{
        return t
    }
}
class Sink<in T>{
    fun consumeT(t:T){
    }
}

fun main(){
    val strSource : Source<String> =Source("producer")
    val anySource:Source<Any> = strSource  //covariance
    anySource.produceT()

    val anySink : Sink<Any> =Sink()
    val strSink :Sink<String> = anySink  //contravariance
    strSink.consumeT("Consumer")
}