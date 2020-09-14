package com.hibernate.spring.service

import com.hibernate.spring.domain.User

interface UserService {
    fun addUser(user: User)
}
