// when expression is similar to switch statement in Java.
fun main(){
    val day = 4
    val result = when (day){    //day is evaluated once
        1 -> "Monday"           //value -> result
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
}