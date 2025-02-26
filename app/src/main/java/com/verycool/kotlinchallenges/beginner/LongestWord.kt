package com.verycool.kotlinchallenges.beginner

//Given a string implement a function which returns longest word in that string.
//If there are two or more words that have the same length,
// return the first longest word from the string.
// Ignore punctuation. Input string can't be empty or blank sering.

fun main(){
    println(longWord("the longie word longer"))
}


fun longWord(input:String):String{
    val words = input.split(" ")
    var longest =""
    words.forEach{
        if(longest.length < it.length){
            longest = it
        }
    }
    return longest
}