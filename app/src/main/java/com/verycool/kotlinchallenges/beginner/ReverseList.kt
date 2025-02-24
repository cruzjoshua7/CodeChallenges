package com.verycool.kotlinchallenges.beginner

//Reverse the given list. Don't use list.reversed() method.

fun main(){
    val list = listOf("ham","tim","can")

    println(reverseList(list))
}

fun<T> reverseList(list:List<T>):List<T>{
    val result = mutableListOf<T>()
    for(i in list.size-1 downTo 0){
        result.add(list[i])
    }
    return result
}

