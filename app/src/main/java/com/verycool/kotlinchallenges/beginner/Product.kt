package com.verycool.kotlinchallenges.beginner

//Given a list of integers implement a function which returns the product of all numbers in the list.

fun main(){
    println(listProduct(listOf(1,2,3)))
}

fun listProduct(list:List<Int>):Int{
    if(list.size == 1){
        return list[0]
    }
    return list[0] * listProduct(list.drop(1))
}