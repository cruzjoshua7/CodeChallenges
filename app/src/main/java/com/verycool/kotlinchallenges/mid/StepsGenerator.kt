package com.verycool.kotlinchallenges.mid

//Given a positive integer n implement a function which returns a list representing
//the generated steps with n levels using the # character. Make sure the step has appropriate number of
//spaces on the right hand side!

fun main(){
    stepGenerator(4)
}

fun stepGenerator(n:Int){
    (0 until n+1).forEach {
        println("#".repeat(it))
    }
}