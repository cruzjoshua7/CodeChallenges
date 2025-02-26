package com.verycool.kotlinchallenges.beginner


//Given a string implement a function which capitalizes first letter of every word in that string.
fun main(){
    val str = "the word is cap"
    println(capEveryFirstChar(str))
}

fun capEveryFirstChar(input:String):String{
    val words = mutableListOf<String>()

    input.split(" ").forEach{
        //words.add(it[0].uppercaseChar() + it.substring(1))
        words.add(it.first().toUpperCase() + it.substring(1))
    }
    return words.joinToString(" ")
}


