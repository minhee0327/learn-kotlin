package jetbrains.play.function

fun main(){
    printAll("Hello", "Hallo", "Salut", "Hola")
}

fun printAll(vararg message: String){
    for(m in message) println(m)
}