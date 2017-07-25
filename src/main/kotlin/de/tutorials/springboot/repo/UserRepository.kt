package de.tutorials.springboot.repo

import de.tutorials.springboot.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {
    fun findByUserName(username: String): User?
}