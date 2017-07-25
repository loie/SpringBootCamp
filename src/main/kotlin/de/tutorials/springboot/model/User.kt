package de.tutorials.springboot.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    var id: Long = 0

    var username : String = ""
    var password : String = ""
}