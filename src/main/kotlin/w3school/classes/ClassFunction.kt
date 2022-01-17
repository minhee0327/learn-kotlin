package w3school.classes

class Car3(var brand: String, var model: String, var year: Int){
    fun drive(){
        println("$model Wrooom!!")
    }
}

fun main(){
    val c1 = Car3("Ford", "Mustang", 1969)
    c1.drive()
}