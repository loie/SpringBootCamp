package de.tutorials.springboot.controller

import de.tutorials.springboot.model.User
import de.tutorials.springboot.repo.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/signup")
class SignupController (val userRepository: UserRepository, val bCryptPasswordEncoder: BCryptPasswordEncoder) {
    @PostMapping
    fun signup(@RequestBody user: User) {
        user.password = bCryptPasswordEncoder.encode(user.password)
        userRepository.save(user)
    }
    
}