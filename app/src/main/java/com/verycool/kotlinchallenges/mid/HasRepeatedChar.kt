package com.verycool.kotlinchallenges.mid

//Given a string implement a function which returns true if string contains at least one repeated character
// , otherwise it returns false.

fun main(){
    println(hasRepeatedChar("yes repeat"))
}

fun hasRepeatedChar(input:String):Boolean{
    val frequency = input.groupingBy { it }.eachCount()
    return frequency.any{ it.value > 1}
}