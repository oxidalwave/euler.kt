package com.oxidalwave.problem001

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem001 : Runnable {
    override fun run() {
        var sum = 0

        for(i in 1 until 1000) {
            if (isMultipleOf3(i) || isMultipleOf5(i)) {
                sum += i
            }
        }

        println(sum)
    }

    fun isMultipleOf3(num: Int): Boolean { return num % 3 == 0 }

    fun isMultipleOf5(num: Int): Boolean { return num % 5 == 0 }
}