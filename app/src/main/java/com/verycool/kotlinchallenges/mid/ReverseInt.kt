package com.verycool.kotlinchallenges.mid

import kotlin.math.sign

//Given an integer n, return an integer that is the reverse ordering of digits.

fun main(){
    val input = -223344
    println(input.reverseInt())
}

fun Int.reverseInt():Int{
    val reverse = this.toString().removePrefix("-").reversed()
    return reverse.toInt() * this.sign
}