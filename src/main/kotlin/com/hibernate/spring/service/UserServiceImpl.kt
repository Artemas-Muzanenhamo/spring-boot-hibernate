package com.hibernate.spring.service

import com.hibernate.spring.domain.UserEntity
import com.hibernate.spring.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
        private val userRepository: UserRepository) : UserService{

    override fun addUser(userEntity: UserEntity) {
        userRepository.save(userEntity)
    }

    override fun getAllUsers(): List<UserEntity> {
        return userRepository.findAll()
    }

    override fun removeUser(userId: Long) {
        userRepository.deleteById(userId)
    }
}
