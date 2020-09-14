package com.hibernate.spring

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ControllerExceptionHandler {

    @ExceptionHandler(IllegalArgumentException::class)
    fun handleUserJsonNotValid(ex: IllegalArgumentException): ResponseEntity<String> {
        val message = ex.localizedMessage
        return ResponseEntity(message, HttpStatus.BAD_REQUEST)
    }
}
