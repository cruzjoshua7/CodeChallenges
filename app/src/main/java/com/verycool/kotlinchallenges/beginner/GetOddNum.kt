package com.verycool.kotlinchallenges.beginner

//Given a list of integers return a list that contains only odd integers
// (only integers which are not a multiple of 2).

fun main(){
    val nums = mutableListOf(1,2,3,4,5,6,7,8,9)
    println(oddOnly(nums))
}

fun oddOnly(list:List<Int>):List<Int>{
    return list.filter { it % 2 == 1 }.toMutableList()
}

