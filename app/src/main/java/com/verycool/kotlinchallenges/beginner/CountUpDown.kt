package com.verycool.kotlinchallenges.beginner

//Given positive integer n implement a function which returns a list
// containing all steps up from 0 to n and down to 0.
fun main(){
    println(countUpDownFor(2))
}

fun countUpThenDown(num: Int): List<Int>{
    val list = mutableListOf<Int>()

    (0..num-1).forEach{
        list.add(it)
    }
    (num downTo 0).forEach {
        list.add(it)
    }
    return list
}

fun countUpDownFor(num:Int): List<Int>{
    val list = mutableListOf<Int>()

    (0..num-1).forEach {
        list.add(it)
    }
    for(i in num downTo 0){
        list.add(i)
    }
    return list
}