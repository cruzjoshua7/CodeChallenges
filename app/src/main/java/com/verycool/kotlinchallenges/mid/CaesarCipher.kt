package com.verycool.kotlinchallenges.mid

//Given a string and integer shift implement a function which shifts each character in that string by shift amount (cesar cipher) eg. if shift is 1 then a becomes b, c becomesd, z became a etc. Allowed input is string containing only lowercase characters from alphabet abcdefghijklmnopqrstuvwxyz.

fun main(){
    println(cipher("abc",1))
    println(cipher("xyz",1))
}

fun cipher(str: String, shift:Int):String{
    val aCode = 'a'.code
    val zCode = 'z'.code
    val realShift = shift % (zCode - aCode+1) //loop abc if needed

    return str.map {
        var code  = it.code // get the int for letter were on
        code += realShift //perform shift

        if(code > zCode){
            code = aCode + (code % zCode) - 1
        } //if needed perform loop
        code.toChar()
    }.joinToString(separator = "")
}