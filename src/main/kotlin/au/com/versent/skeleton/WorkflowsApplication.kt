package au.com.versent.skeleton

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class WorkflowsApplication

fun main(args: Array<String>) {
    SpringApplication.run(WorkflowsApplication::class.java, *args)
}