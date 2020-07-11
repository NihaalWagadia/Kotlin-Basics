package basics.oo

class Robot(val name:String){
    fun greetHuman(){
        println("Hello human, my name is $name")
    }

    fun knowsItsName():Boolean = name.isNotBlank()
}

fun main(){
    val fightRobot = Robot("Kileer8080")
    if(fightRobot.knowsItsName()){
        fightRobot.greetHuman()
    }
}