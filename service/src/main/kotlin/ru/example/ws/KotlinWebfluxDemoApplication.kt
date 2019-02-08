package ru.example.ws

import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class KotlinWebfluxDemoApplication

fun main(args: Array<String>) {
    val app = SpringApplication(KotlinWebfluxDemoApplication::class.java)
    app.webApplicationType = WebApplicationType.REACTIVE
    app.run(*args)
}
