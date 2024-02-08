package org.example.pp_springboot;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PPSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PPSpringBootApplication.class, args);

        System.out.println("Приложение запустилось! Откройте страницу http://localhost:8080/");
    }

}
