package com.verycool.kotlinchallenges.beginner

import android.os.Build.VERSION_CODES.P

//Given list of strings implement a recursive function
// which will capitalize first letter of each string in the list.
fun main(){
    println(capFirstRecursion(listOf("bam","ham","can")))
}

fun capFirstRecursion(list:List<String>): List<String>{
    if(list.isEmpty()){
        return emptyList()
    }
    var newList = listOf(list.first().replaceFirstChar { string -> string.uppercaseChar()})
    return newList + capFirstRecursion(list.drop(1))
}