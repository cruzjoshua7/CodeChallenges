package com.verycool.kotlinchallenges.beginner

//Given positive integer n implement a function
//which returns a list containing all steps from n to 0.
fun main(){
    println(countDownList(5))
}

fun countDownList(num:Int):List<Int>{
    val nums = mutableListOf<Int>()
    (num downTo 1).forEach{
        nums.add(it)
    }
    return nums
}

fun countDownForLoop(num:Int):List<Int>{
    val list = mutableListOf<Int>()
    for(i in num downTo 1){
        list.add(i)
    }
    return list
}