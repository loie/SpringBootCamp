package de.tutorials.springboot.controller

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestBody

import de.tutorials.springboot.model.GreetModel
import de.tutorials.springboot.service.GreetService

@RestController
public class GreetController (val service: GreetService) {

    @GetMapping("/greet")
    fun greet(@RequestParam(value="name", defaultValue="World") name: String) : GreetModel {
        return service.greet(name)
    }

    @PostMapping("/greet")
    fun save(@RequestBody model: GreetModel) : GreetModel {
        return service.greet(model.someText + (" copy"), !model.someBoolean, model.someInt+ 1)
    }
}