package com.oxidalwave

import com.oxidalwave.problem001.Problem001
import com.oxidalwave.util.*

fun main(args: Array<String>) {
    println("Please enter a problem number, H for the menu, or Q to quit.")

    val input = readLine()

    val problem: Runnable? = when (input?.toUpperCase()) {
        "1" -> Problem001()
        "H" -> HelpMenu()
        "Q" -> Quit()
        else -> null
    }

    if (problem != null) {
        problem.run()
        main(args)
    } else {
        println("Invalid value.")
        main(args)
    }
}
