package jetbrains.play.function

fun main(){
    infix fun Int.times(str: String) = str.repeat(2)        //중위함수 선언 : times
    println(2 times "Bye ")                                     //중위함수 호출

    println("Bye ".repeat(2))

    val pair = "Ferrari" to "Katrina"                           //표준 라이브러리의 중위함수 중 to 를 호출해서 pari(쌍)을 만들어준다
    println(pair)                                               //(Ferrari, Katrina)

    infix fun String.onto(other: String) = Pair(this, other)    //위에서 사용한 to 중위함수를 구현해봄
    val myPair = "Ferrari".onto("Katrina")
    println(myPair)

    println("============")
    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
    sophia likes claudia            //sophia 가 첫번째 매개변수가 됩니다.
    for(s in sophia.likedPeople){
        println(s.name)
    }
}

class Person(val name: String){
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person){likedPeople.add(other)}
}