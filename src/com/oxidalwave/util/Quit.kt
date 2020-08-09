package com.oxidalwave.util

import kotlin.system.exitProcess

class Quit : Runnable {
    override fun run() {
        exitProcess(0)
    }

}