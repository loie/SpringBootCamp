package de.tutorials.springboot.controller

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

import de.tutorials.springboot.model.GreetModel

@RestController
public class GreetController {


    @GetMapping("/greet")
    fun greet() = greetName("World")


    @GetMapping("/greet/{name}")
    fun greetName(@PathVariable name: String) = GreetModel("Hallo $name")

    @PostMapping("/greet")
    fun save(@RequestBody model: GreetModel)  = GreetModel(model.someText + (" copy"), !model.someBoolean, model.someInt+ 1)
}