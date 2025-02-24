package com.verycool.kotlinchallenges.mid


//Given a string implement a function which returns the character
//that is most commonly used in that string.
fun main(){

    println(findMaxChar("abcccccccddddddddddd"))
}

fun findMaxChar(str:String):Char?{
    val map = str.groupBy { it }
    var maxChar: Char? = null
    var maxCount = 0

    for((char,list) in map){
        if(list.size > maxCount){
            maxCount = list.size
            maxChar = char
        }
    }

    return maxChar
}