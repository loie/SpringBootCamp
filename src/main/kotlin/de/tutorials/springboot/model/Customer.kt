package de.tutorials.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Customer (
            val firstName: String,
            val lastName: String,
            @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
            val id: Long = -1) {
                private constructor() : this("", "")
}