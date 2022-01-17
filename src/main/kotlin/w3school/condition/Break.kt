fun main(){
    for(nums in 5 .. 15){
        if (nums == 10){
            break
        }
        println(nums)
    }
    println("======================")

    for(nums in 5 .. 15){
        if (nums == 10){
            continue
        }
        println(nums)
    }
}