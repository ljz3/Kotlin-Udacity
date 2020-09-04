import java.util.*

fun main(args: Array<String>){
    println(when (args[0].toInt()){
        0-12 -> "Good morning, Kotlin"
        12-23 -> "Good night, Kotlin"
        else -> ""
    })
}
fun dayOfWeek(){
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}