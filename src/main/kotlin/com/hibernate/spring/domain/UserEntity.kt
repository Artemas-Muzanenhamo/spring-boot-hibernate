package com.hibernate.spring.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class UserEntity(
        @Id
        @GeneratedValue
        val id: Long,
        val name: String,
        val surname: String,
        val dateOfBirth: String
)
