package com.verycool.kotlinchallenges.beginner

//Given positive integer n implement a function,
// which returns a factorial of that integer.
// Factorial (of positive integer) is number that is created by
// multiplying all numbers from 1 to n eg. factorial of 3 (3!) is equal to 6 (3 * 2 * 1)

fun main(){
    println(factorial(1))
}

fun factorial(num:Int):Int{
    if(num==1){
        return 1
    }
    return num * factorial(num-1)
}