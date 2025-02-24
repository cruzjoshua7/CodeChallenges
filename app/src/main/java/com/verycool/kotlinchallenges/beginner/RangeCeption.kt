package com.verycool.kotlinchallenges.beginner

//Given two ranges implement a function which checks if range1 contains range2.
fun main(){
    println(checkRangeCeption(5..8,5..9))
    println(checkRangeCeption(1..10,5..9))
}

fun checkRangeCeption(range1: IntRange, range2 : IntRange):Boolean{
    return range1.first <= range2.first && range1.last >= range2.last
}