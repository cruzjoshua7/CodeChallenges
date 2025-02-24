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
    println(snakeToCamel(str))
}

fun snakeToCamel(str:String):String{
    val words = str.split("_")
    var first = true
    var newStr =""
    for(word in words){
        if(first){
            newStr = word.toLowerCase()
            first = false
        }else{
            newStr = "$newStr${word[0].toUpperCase().toString() + word.substring(1).toLowerCase()}"
        }
    }

    return newStr
}

