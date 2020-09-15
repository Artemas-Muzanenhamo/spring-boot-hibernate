package com.hibernate.spring

import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ControllerExceptionHandler {

    @ExceptionHandler(IllegalArgumentException::class)
    fun handleUserJsonNotValid(ex: IllegalArgumentException): ResponseEntity<Message> {

        val message = ex.localizedMessage
        return ResponseEntity
                .badRequest()
                .contentType(APPLICATION_JSON)
                .body(Message(message))
    }
}

data class Message(val message: String)
