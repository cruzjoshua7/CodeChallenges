package com.verycool.kotlinchallenges.beginner

//Given a string implement a function which returns longest word in that string.
//If there are two or more words that have the same length,
// return the first longest word from the string.
// Ignore punctuation. Input string can't be empty or blank sering.

fun main(){
    println(longestWord("the long word longer"))
}

fun longestWord(str:String):String{
    var words = str.split(" ")
    var longWord = words[0]
    for(word in words){
        if(longWord.length < word.length){
            longWord = word
        }
    }
    return longWord
}