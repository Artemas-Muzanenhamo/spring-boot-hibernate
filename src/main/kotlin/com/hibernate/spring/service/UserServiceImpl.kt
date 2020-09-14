package com.hibernate.spring.service

import com.hibernate.spring.domain.User
import com.hibernate.spring.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
        private val userRepository: UserRepository) : UserService{

    override fun addUser(user: User) {
        userRepository.save(user)
    }

    override fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }
}
