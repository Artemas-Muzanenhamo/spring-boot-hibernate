package com.hibernate.spring.service

import com.hibernate.spring.domain.UserEntity
import com.hibernate.spring.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
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

    override fun removeAllUsers() {
        userRepository.deleteAll()
    }
}
