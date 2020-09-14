package com.hibernate.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootHibernateApplication

fun main(args: Array<String>) {
    runApplication<SpringBootHibernateApplication>(*args)
}
