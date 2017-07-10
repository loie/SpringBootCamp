package de.tutorials.springboot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository

import de.tutorials.springboot.model.Customer;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
interface CustomerRepository : CrudRepository<Customer, Long> {

    fun findByLastName(lastName: String): Iterable<Customer>
}