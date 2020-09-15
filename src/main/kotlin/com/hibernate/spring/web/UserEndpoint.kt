package com.hibernate.spring.web

import com.hibernate.spring.converter.UserConverter
import com.hibernate.spring.domain.UserJson
import com.hibernate.spring.service.UserService
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserEndpoint(userServiceImpl: UserService) {
    private val userService: UserService = userServiceImpl

    @PostMapping("/api/user")
    fun addUser(@RequestBody user: UserJson) {
        val userEntity = UserConverter().convertToUserEntity(user)
        userService.addUser(userEntity)
    }

    @GetMapping("/api/users", produces = [APPLICATION_JSON_VALUE])
    fun getAllUsers(): List<UserJson> {
        return userService.getAllUsers()
                .map(UserConverter()::convertToUserJson)
    }
}
