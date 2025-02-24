package com.verycool.kotlinchallenges.beginner

//Given list of strings and a string
// return index of the value in the list or -1 if value was not found.

fun main(){
    val list = listOf("ham","can","rat","mat","cat")
    println(strIndex(list,"rat"))
}

fun strIndex(strList:List<String>, target:String): Int{
    strList.forEachIndexed{index, element ->
        if(target == element){
            return index
        }
    }
    return -1
}

