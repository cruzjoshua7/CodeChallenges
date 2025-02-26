package com.verycool.kotlinchallenges.beginner

//Given a sorted list of integers implement a function which counts the unique values.

fun main(){
    val sortedList = listOf(1,2,2,3,4,4,5,6)

    println(uniqueCountSet(sortedList))
}

fun uniqueCount(list:List<Int>):Int{
    //return list.toSet().size
    return list.distinct().size
}

fun uniqueCountSet(list:List<Int>):Int{
    val set = list.toSet()
    val count = set.size
    return count
}
