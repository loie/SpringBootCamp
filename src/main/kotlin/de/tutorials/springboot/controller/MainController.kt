package de.tutorials.springboot.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.beans.factory.annotation.Autowired

import de.tutorials.springboot.model.Customer
import de.tutorials.springboot.repo.CustomerRepository

@RestController
class MainController {
    @Autowired
    lateinit var repository : CustomerRepository

    @GetMapping("/save")
    fun save() : String {
        repository.save(Customer("Jack", "Smith"))
        repository.save(Customer("Adam", "Johnson"))
        repository.save(Customer("Kim", "Smith"))
        repository.save(Customer("David", "Williams"))
        repository.save(Customer("Peter", "Davis"))

        return "done"
    }

    @GetMapping("/findall")
    fun findAll() = repository.findAll()

    @GetMapping("/findbyid/{id}")
    fun findById(@PathVariable id: Long) = repository.findOne(id)

    // @GetMapping("/findbylastname/{lastName}")
    // fun findByLastName(@PathVariable lastName: String) = repository.findByLastName(lastName)
}
