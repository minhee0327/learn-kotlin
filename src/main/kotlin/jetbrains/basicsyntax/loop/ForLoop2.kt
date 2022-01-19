package jetbrains.basicsyntax.loop

fun main(){
    for(x in 1.. 5){
        println(x)
    }
    println("--------------")
    for( x in 1..10 step 2){
        println(x)
    }
    println("--------------")
    for(x in 9 downTo 0 step 3){
        println(x)
    }
}