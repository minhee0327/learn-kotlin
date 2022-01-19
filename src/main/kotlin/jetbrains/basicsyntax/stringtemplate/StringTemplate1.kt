package jetbrains.basicsyntax.stringtemplate

fun main(){
    var a = 1
    val s1 = "a is $a"
    a = 2

    println("${s1.replace("is", "was")} , but now is $a")
}
//ref: https://kotlinlang.org/docs/basic-syntax.html#string-templates
