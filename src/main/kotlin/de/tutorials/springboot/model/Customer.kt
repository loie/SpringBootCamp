package de.tutorials.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Customer (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val firstName: String,
        val lastName: String,
        val id: Long = -1
) {
        private constructor() : this("", "")
}