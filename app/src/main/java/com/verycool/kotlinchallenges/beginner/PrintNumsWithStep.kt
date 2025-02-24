package com.verycool.kotlinchallenges.beginner

//Given positive integer n and integer step implement
// a function which returns a list representing all numbers from n to 1
// taking step into consideration. If n value is zero then empty list should be returned.

fun main(){
    println(numsWithSteps(5,2))
}

fun numsWithSteps(num:Int, step: Int):List<Int> {
    return (num downTo 1 step step).toList()
}
