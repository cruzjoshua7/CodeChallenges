package com.verycool.kotlinchallenges.beginner

//Given a string representing constant name
// (upper case words separated by underscore eg FOO_BAR)
// implement a function which converts it into variable name (eg. fooBar):
//convert first word to lowercase
//convert next words to lowercase, but first character is still uppercase
//remove all underscore characters

//Upper_snake to camelcase

fun main(){
    val str = "FOO_BAR_Ham"
    println(snakeCamel(str))
}

fun snakeCamel(input:String):String{
    val words = input.split("_")
    var result = ""
    var first = true
    words.forEach{
        if(first){
            result += it.toLowerCase()
            first=false
        }else{
            result += it.first().toUpperCase() + it.substring(1).toLowerCase()
        }
    }
    return result
}


