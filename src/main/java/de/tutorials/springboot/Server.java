package de.tutorials.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Über diese Annotation kann man diverse Grundmechanismen von spring-boot steuern, bpsw. welche "Addons" geladen werden dürfen.
@SpringBootApplication
public class Server {
    // Es muss mindestens eine Klasse mit main-Methode existieren. Die wird vom maven-Plugin gesucht und als Standard-Main-Klasse genutzt.
    public static void main(String[] args) {
        // Startvorgang an spring-boot delegieren. Per args kann man auch diverse Startparameter angeben:
        // - https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html
        // - https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
        SpringApplication.run(Server.class, args);
    }
}
