package com.hibernate.spring

import org.springframework.dao.EmptyResultDataAccessException
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

    @ExceptionHandler(NumberFormatException::class)
    fun handleNumberFormatException(ex: NumberFormatException): ResponseEntity<Message> {
        return ResponseEntity
                .badRequest()
                .contentType(APPLICATION_JSON)
                .body(Message("The User Id supplied is not valid"))
    }

    @ExceptionHandler(EmptyResultDataAccessException::class)
    fun handleEmptyResultDataAccessException(ex: EmptyResultDataAccessException): ResponseEntity<Message> {
        return ResponseEntity
                .badRequest()
                .contentType(APPLICATION_JSON)
                .body(Message("Something went wrong"))
    }
}

data class Message(val message: String)
