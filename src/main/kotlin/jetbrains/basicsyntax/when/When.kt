package jetbrains.basicsyntax.`when`

fun main(){
    val retrievedVal = describe(1234234)
    println(retrievedVal)
}

fun describe(obj: Any): String =
    when(obj){
        1 -> "One"
        "Hello" -> "Two"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unkown"
    }

//https://kotlinlang.org/docs/basic-syntax.html#when-expression