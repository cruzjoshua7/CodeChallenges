package com.verycool.kotlinchallenges.mid

import java.io.DataInput

//Given a string, return true if the string is a palindrome or false if it is not.
// Palindromes are strings that form the same word if it is reversed.
// Include spaces and punctuation in determining if the string is a palindrome.

fun main(){
    println(isPali("race car"))
    println(isTolPali("abb#a"))
    println(permutPali("gikig"))
}

fun isPali(str:String):Boolean{
    if(str.equals(stringReverse(str))){
        return true
    }
    return false
}

fun stringReverse(str:String):String{
    var result =""
    for(i in str.length -1 downTo 0){
        result += str[i]
    }
    return result
}

//Given a string, return true if the string is a palindrome or false if it is not.
//Palindromes are strings that form the same word when reversed (including spaces and punctuation).
//In this exercise one bad character is allowed.
// The string will be (tolerant) palindrome if after removing one character string is a palindrome.

fun isTolPali(str: String):Boolean{
    if(isPali(str)) return true
    var charRemoved = false
    var leftIndex = 0
    var rightIndex = str.lastIndex

    while (leftIndex <= rightIndex){
        if(str[leftIndex] != str[rightIndex]){
            if(charRemoved)return false

            charRemoved=true
            when{
                str[leftIndex+1] == str[rightIndex] -> leftIndex++
                str[leftIndex] == str[rightIndex-1] -> rightIndex--
                else -> return false
            }
        }
        leftIndex++
        rightIndex--
    }
    return true
}

//Given a string, return true if the input string is a permutation of palindrome
// or false if it is not. Permutation means that all letters of the string can be
// used to create a palindrome.
//Palindromes are strings that form the same word if it is reversed.

fun permutPali(input: String):Boolean{
    return input
        .groupBy { it }
        .map{it.value}
        .map { it.size }
        .count{it%2 == 1} ==1
}
