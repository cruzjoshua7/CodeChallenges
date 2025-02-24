package com.verycool.kotlinchallenges.mid

//Given positive integer n implement a function which returns a list numbers
// from 1 to n. However for multiples of three list should contain word Fizz
// instead of the number and for the multiples of five list should contain word Buzz.
// For numbers which are multiples of both three and five list should contain FizzBuzz word.

fun main(){
    println(fizzBuzz(16))
}

fun fizzBuzz(n : Int): List<String>{
    val list = mutableListOf<String>()

    (1 until n+1).forEach {
        if(it%3 == 0 && it%5 == 0){
            list.add("FizzBuzz")
        }else if(it%3 == 0 ){
            list.add("Fizz")
        }else if(it%5 == 0){
            list.add("Buzz")
        }else{
            list.add(it.toString())
        }
    }
    return list
}