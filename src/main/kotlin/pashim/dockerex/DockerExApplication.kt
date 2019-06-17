package pashim.dockerex

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerExApplication

fun main(args: Array<String>) {
	runApplication<DockerExApplication>(*args)
}
