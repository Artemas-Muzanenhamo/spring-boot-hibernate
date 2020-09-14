package com.hibernate.spring.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class UserJson(
        val id: Long?,
        val name: String?,
        val surname: String?,
        val dateOfBirth: String?
)
