package com.verycool.kotlinchallenges.expert


//Given a list and chunk size, divide the list into multiple sub lists where each sub-list is of length of chunk size.
fun main(){
    println(chunk(listOf(1, 2, 3, 4), 2) )
}

fun chunk(list:List<Int>, size:Int):List<List<Int>>{
    val chunk = mutableListOf<MutableList<Int>>()

    list.forEach{
        if(chunk.size == 0 || chunk.last().size == size){
            chunk.add(mutableListOf(it))
        }else{
            chunk.last().add(it)
        }
    }
    return chunk
}