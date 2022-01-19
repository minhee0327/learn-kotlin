package jetbrains.play.function

fun main(){
    operator fun Int.times(str: String) = str.repeat(this) //연산자 오버로딩: times()의 연산자 기호는 * 이다.
    println( 2 * "Bye ")                                      //떠라서 해당 함수를 다음과 같이 호출할 수 있다.

    operator fun String.get(range: IntRange) = substring(range)//연산자함수는 문자열의 범위를 접근하기 쉽게 해준다.
    val str = "Always forgive your enemies. nothing annoys then so much."
    println(str[0..14])                                 //get operator는 [] 엑세스 구문을 활성화 합니다.

}