package com.verycool.kotlinchallenges.beginner

//Given list of strings representing train station names
// implement a function which will return passenger friendly String:
//String always starts with Train is calling at
//If list contains single train station name, then return Train is calling at stationName
//If list contains multiple train station names,
// then return comma separated station names, but the last two names are separated by and word.

fun main(){
    print(formatTrainRoute(listOf("pika", "char" , "eevee", "ham")))
}

fun formatTrainRoute(list:List<String>):String{
    val prefix = "Train is calling at "

    if(list.size ==1){
        return prefix + list[0]
    }
    //By default, joinToString uses ", " as a separator.
    val last = list.takeLast(1).joinToString { it }
    val rest = list.dropLast(1).joinToString { it }

    return "$prefix$rest and $last"
}