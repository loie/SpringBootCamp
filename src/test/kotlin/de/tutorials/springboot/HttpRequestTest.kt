package de.tutorials.springboot

import org.assertj.core.api.Assertions.assertThat

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HttpRequestTest {
    @LocalServerPort
    var port : Int = 0

    @Autowired
    lateinit var restTemplate : TestRestTemplate

    @Test
    fun greetingShouldReturnDefaultMessage () {
        // assertThat(this.restTemplate.getForObject("http://localhost:$port/greet", String::class.java)).contains("Hello World")
    }
}