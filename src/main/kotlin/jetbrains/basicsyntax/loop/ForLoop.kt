package jetbrains.basicsyntax.loop

fun main(){
    println("[for] 반복문")

    val items = listOf("apple", "banana", "kiwi")

    for(item in items){
        println(item)
    }
    for(index in 0.. (items.size - 1)){
        println(index)
    }
    for(index in 0 until items.size){
        println(index)
    }
    for(index in items.indices){
        println(index)
    }
}

//https://kotlinlang.org/docs/basic-syntax.html#for-loop
//https://sas-study.tistory.com/324