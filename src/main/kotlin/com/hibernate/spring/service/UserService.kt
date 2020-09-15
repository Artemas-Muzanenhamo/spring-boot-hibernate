package com.hibernate.spring.service

import com.hibernate.spring.domain.UserEntity

interface UserService {
    fun addUser(userEntity: UserEntity)
    fun getAllUsers(): List<UserEntity>
    fun removeUser(userId: Long)
}
