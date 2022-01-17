fun main(){
    myFunction("mini", 32)         //인수(argument): mini, sung-ho, morning-memo
    myFunction("sung-ho", 27)
    myFunction("morning-memo", 35)
}

fun myFunction(name: String, age: Int){       //매개변수(parameter): name
    println("Hello $name : $age")
}

