package com.verycool.kotlinchallenges.beginner

fun main(){
    println(power(3,2))

}

fun power(base:Int, exp:Int):Int{
    if(exp==1){
        return base
    }
    if(exp==0){
        return 1
    }
    //recursion for less boilerplate
    return base * power(base,exp-1)
}