package com.verycool.kotlinchallenges.beginner

//given num show all combination for 0..num
fun main(){
    println(genAllPairs(3))
}


fun genAllPairs(num:Int): List<Pair<Int,Int>>{
    return (0..num).map { i->
        (0..num).map { j->
            i to j
        }
    }.flatten()
}