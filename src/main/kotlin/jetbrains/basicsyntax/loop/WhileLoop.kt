package jetbrains.basicsyntax.loop

fun main(){
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while(index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }
}