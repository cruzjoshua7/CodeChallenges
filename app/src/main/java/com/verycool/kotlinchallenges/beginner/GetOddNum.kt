package com.verycool.kotlinchallenges.beginner

//Given a list of integers return a list that contains only odd integers
// (only integers which are not a multiple of 2).

fun main(){
    val nums = intArrayOf(1,2,3,4,5,6,7,8,9)
    println(oddFilter(nums))
}

fun oddFilter(nums:IntArray): MutableList<Int> {
    val oddNums = mutableListOf<Int>()
    for(num in nums){
        if(num%2 == 1){
            oddNums.add(num)
        }
    }
    return oddNums
}