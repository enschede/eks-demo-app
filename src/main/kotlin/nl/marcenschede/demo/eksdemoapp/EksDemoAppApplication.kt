package nl.marcenschede.demo.eksdemoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class EksDemoAppApplication {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello world from my Spring Boot app"
    }
}

fun main(args: Array<String>) {
    runApplication<EksDemoAppApplication>(*args)
}
