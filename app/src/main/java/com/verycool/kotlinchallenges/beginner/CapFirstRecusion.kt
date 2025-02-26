package com.verycool.kotlinchallenges.beginner

import android.os.Build.VERSION_CODES.P

//Given list of strings implement a recursive function
// which will capitalize first letter of each string in the list.
fun main() {
    println(capFirstRecursionScope(listOf("bam", "ham", "can")))
}

fun capFirstRecursion(list: List<String>): List<String> {
    if (list.isEmpty()) {
        return emptyList()
    }
    var newList = listOf(list.first().replaceFirstChar { string -> string.uppercaseChar() })
    return newList + capFirstRecursion(list.drop(1))
}

fun capFirstRecursionScope(list: List<String>): List<String> {
    if (list.isEmpty()) {
        return emptyList()
    }
    val newList = listOf(list.first().run {
        //this.first().uppercaseChar() + this.drop(1)
        first().uppercaseChar() + drop(1)
        }
    )
    return newList + capFirstRecursionScope(list.drop(1))
}