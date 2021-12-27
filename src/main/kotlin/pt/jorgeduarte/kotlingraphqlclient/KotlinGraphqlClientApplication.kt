package pt.jorgeduarte.kotlingraphqlclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinGraphqlClientApplication

fun main(args: Array<String>) {
	runApplication<KotlinGraphqlClientApplication>(*args)
}
