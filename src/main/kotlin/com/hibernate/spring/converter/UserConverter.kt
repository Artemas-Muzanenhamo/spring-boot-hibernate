package com.hibernate.spring.converter

import com.hibernate.spring.domain.UserEntity
import com.hibernate.spring.domain.UserJson

class UserConverter {
    fun convertToUserEntity(user: UserJson): UserEntity {
        val userId = user.id ?: throw IllegalArgumentException("User id is not valid")
        val userName = user.name ?: throw IllegalArgumentException("User name is not valid")
        val userSurname = user.surname ?: throw IllegalArgumentException("User surname is not valid")
        val userDateOfBirth = user.dateOfBirth ?: throw IllegalArgumentException("User date of birth is not valid")

        return UserEntity(userId, userName, userSurname, userDateOfBirth)
    }

    fun convertToUserJson(userEntity: UserEntity): UserJson {
        return UserJson(userEntity.id, userEntity.name, userEntity.surname, userEntity.dateOfBirth)
    }
}
