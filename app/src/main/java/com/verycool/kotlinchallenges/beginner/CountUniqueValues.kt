package com.verycool.kotlinchallenges.beginner

//Given a sorted list of integers implement a function which counts the unique values.

fun main(){
    val sortedList = listOf(1,2,2,3,4,4,5,6)

    println(uniqueCount(sortedList))
}

fun uniqueCount(list:List<Int>):Int{
    //return list.toSet().size
    return list.distinct().size
}