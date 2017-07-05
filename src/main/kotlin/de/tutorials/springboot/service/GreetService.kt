package de.tutorials.springboot.service

import org.springframework.stereotype.Service
import de.tutorials.springboot.model.GreetModel

@Service
class GreetService {

    fun greet(name: String = "Horst", someBool: Boolean = false, someInt: Int = 12) : GreetModel = GreetModel("Hello $name", someBool, someInt)
}