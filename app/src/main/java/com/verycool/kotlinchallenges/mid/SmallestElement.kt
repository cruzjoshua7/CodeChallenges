package com.verycool.kotlinchallenges.mid

import java.util.Collections
import java.util.PriorityQueue

//Implement a function that takes a list of integers and an integer count as input parameters.
// The purpose of the function is to find the smallest count numbers from the provided list.
//If the size of the list is less than or equal to 'count', the function should return the original list.

fun main(){
    println(findMin(listOf(5, 1, 3), 2))
}

fun findMin( list: List<Int>, count:Int):List<Int>{
    if(list.size <= count){
        return list
    }

    val priorityQueue = PriorityQueue<Int>(Collections.reverseOrder())

    repeat(count){
        priorityQueue.add(list[it])
    }

    list.drop(count)
        .forEach{
            if( it < priorityQueue.peek()){
                priorityQueue.poll()
                priorityQueue.add(it)
            }
        }
    return priorityQueue.toList()
}