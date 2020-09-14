package com.hibernate.spring.web

import com.hibernate.spring.domain.User
import com.hibernate.spring.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserEndpoint(userServiceImpl: UserService) {
    private val userService: UserService = userServiceImpl

    @PostMapping("/api/user")
    fun addUser(user: User) {
        userService.addUser(user)
    }
}
