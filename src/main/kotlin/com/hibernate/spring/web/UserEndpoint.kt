package com.hibernate.spring.web

import com.hibernate.spring.converter.UserConverter
import com.hibernate.spring.domain.UserJson
import com.hibernate.spring.service.UserService
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.*

@RestController
class UserEndpoint(
        private val userService: UserService) {

    @PutMapping("/api/users/user", consumes = [APPLICATION_JSON_VALUE])
    @ResponseBody
    @ResponseStatus(CREATED)
    fun addUser(@RequestBody user: UserJson) {
        val userEntity = UserConverter().toUserEntity(user)
        userService.addUser(userEntity)
    }

    @GetMapping("/api/users", produces = [APPLICATION_JSON_VALUE])
    fun getAllUsers(): List<UserJson> {
        return userService.getAllUsers()
                .map(UserConverter()::toUserJson)
    }
}
