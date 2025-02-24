package com.verycool.kotlinchallenges.beginner

//Given positive integer n implement a function which
// calculates sum of all numbers from 1 up to (and including) number n.
fun main(){
    println(sumUpTo(3))
}

fun sumUpTo(num:Int):Int{
    //return (0..num).sum()
    var sum = 0
    (0..num).forEach {
        sum += it
    }
    return sum
}