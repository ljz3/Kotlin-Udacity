import java.util.*

 fun main(args: Array<String>){
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if(shouldChangeWater(day)){
        println("Change water today")
    }

    dirtyProcessor()
}

fun randomDay(): String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String{
    var food = "fasting"

    when(day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}


fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean{
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

var dirty = 20

val waterFilter: (Int) -> Int = {dirty -> dirty/2}
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int):  Int{
    return operation(dirty)
}

fun dirtyProcessor(){
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty){dirty -> dirty + 50}
}

fun getDirtySensorReading() = 20

fun fitMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean{
    var inches = currentFish.sum()
    if(hasDecorations){
        return inches + fishSize <= (0.8*tankSize)
    }else{
        return inches + fishSize <= tankSize
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"