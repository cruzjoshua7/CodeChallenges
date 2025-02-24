package com.verycool.kotlinchallenges.mid

//Given string implement a function, which returns the number of vowels used in a string.
//Vowels are the characters a , e i, o, u and y.

fun main(){
    val input = "There are six i"
    println("${findVowels(input)}")
}

fun findVowels(input:String):Int{
    var count = 0

    input.forEach {
        if(it.isVowel()){
            count++
        }
    }
    return count
}

fun Char.isVowel():Boolean{
    return this.toLowerCase() in listOf('a', 'e', 'i', 'o', 'u')
}