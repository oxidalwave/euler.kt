package com.oxidalwave.util

class HelpMenu : Runnable {
    val menu = """
        1 -> Problem 1
        H -> Help Menu
        Q -> Quit
    """.trimIndent()

    override fun run() {
        println(menu)
    }
}