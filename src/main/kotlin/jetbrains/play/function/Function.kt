package jetbrains.play.function

fun printMessage(message:String): Unit { //Unit 은 생략이 가능하다.
    println(message)
}

fun printMessageWithPrefix(message:String , prefix: String = "Info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int{
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main(){
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello") //prefix 가 기본적으로 Info 가 사용된다.
    printMessageWithPrefix(prefix = "Log", message = "Hello") //named arguments 를 사용해서  인수의 순서를 변경할 수 있다.
    println(sum(1, 2))
    println(multiply(2, 4))
}