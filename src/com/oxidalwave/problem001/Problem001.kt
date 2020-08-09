package com.oxidalwave.problem001

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem001 : Runnable {

    override fun run() {
        val range = 1 until 1000
        val divisors = intArrayOf(3, 5)

        println(functional(range, divisors))
        println(procedural(range, divisors))
    }

    private val functional = { range: IntRange, divisors: IntArray ->
        (range).filter {
            divisors.any { divisor: Int ->
                divisor.divides(it)
            }
        }.sum()
    }

    private fun procedural(range: IntRange, divisors: IntArray): Int {
        var sum = 0
        for(i in range) {
            if(divisors.any{divisor: Int -> divisor.divides(i)}) {
                sum += i
            }
        }
        return sum
    }

    private fun Int.divides(num: Int): Boolean {
        return num % this == 0
    }


}