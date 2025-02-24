package com.verycool.kotlinchallenges.mid

fun main(){

}

fun strReverse(input:String):String{
    //return input.reversed()

    var reversed = ""
    input.forEach {
        reversed =  it + reversed
    }
    return reversed
}