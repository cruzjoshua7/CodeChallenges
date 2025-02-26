package com.verycool.kotlinchallenges.beginner

//Given list of strings and a string
// return index of the value in the list or -1 if value was not found.

fun main(){
    val list = listOf("ham","can","rat","mat","can", "cat")
    println(linearSearch2(list,"can"))
}

fun linearSearch(list:List<String>, target: String):Int{
    list.forEachIndexed{ index, element ->
        if(element.equals(target)){
            return index
        }
    }
    return -1
}

fun linearSearch2(list:List<String>, target: String):Int{
    list.forEach{ element ->
        if(element.equals(target)){
            return list.indexOf(element)
        }
    }
    return -1
}



