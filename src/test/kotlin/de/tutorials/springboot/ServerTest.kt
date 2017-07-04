package de.tutorials.springboot

import de.tutorials.springboot.controller.GreetController
import org.assertj.core.api.Assertions.assertThat

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
public class ServerTest {

    @Autowired
    lateinit var controller : GreetController


    @Test
    fun contextLoads () {
        assertThat(this.controller).isNotNull()
    }
}