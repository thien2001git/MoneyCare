package org.hxt.moneycare

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BackEndApplication

fun main(args: Array<String>) {
    runApplication<BackEndApplication>(*args)
}
