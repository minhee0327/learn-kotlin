package w3school.classes

class Car4(var brand: String, var model: String, var year: Int){
    fun drive(){
        println("Wroom!!")
    }
    fun speed(maxSpeed: Int){
        println("Max Spped is: " + maxSpeed)
    }
}

fun main(){
    val c1 = Car4("Ford", "Mustang", 1969)

    c1.drive()
    c1.speed(200)
}