package com.verycool.kotlinchallenges.mid

//Given two strings, implement a function to determine
// if the second string is an anagram of the first.
// An anagram is a word, phrase, or name formed by rearranging the letters
// of another, such as cinema, formed from iceman.
// Only consider characters, not spaces or punctuation.
// Consider capital letters to be the same as lower case.

fun main(){

}

fun anagramCheck( str1:String, str2:String):Boolean{
    val a1 = str1.toUpperCase().filter { it.isLetter() }.groupBy { it } //Map<Char,List<Char>>
    val a2 = str2.toUpperCase().filter { it.isLetter() }.groupBy { it }
    return a1 == a2
}