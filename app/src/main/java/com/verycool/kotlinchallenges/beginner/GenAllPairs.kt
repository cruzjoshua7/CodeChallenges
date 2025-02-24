package com.verycool.kotlinchallenges.beginner

fun main(){
    println(genAllPairs(1))
}

fun genAllPairs(num:Int): List<Pair<Int,Int>>{
    return (0..num).map { i->
        (0..num).map { j->
            i to j
        }
    }.flatten()
}