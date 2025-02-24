package com.verycool.kotlinchallenges.mid

//Given a positive integer n implement a function which returns a list representing
//the generatePyramid shape with n levels. The function should console log a generatePyramid
//shape with N levels using the # character. Make sure the generatePyramid has spaces on both the
// left and right hand sides.
fun main(){
    GeneratePyrimid(5).forEach{println(it)}
}

fun GeneratePyrimid(n:Int):List<String>{
    val list = mutableListOf<String>()
    val numColumns = (n * 2) - 1

    (0 until n).forEach { row ->
        val numHashes = (row * 2) + 1
        val numSpaces = numColumns - numHashes
        var sideString = ""
        repeat(numSpaces / 2) { sideString += " " }
        var hashString = ""
        repeat(numHashes) { hashString += "#" }
        list.add("$sideString$hashString$sideString")
    }
    return list
}