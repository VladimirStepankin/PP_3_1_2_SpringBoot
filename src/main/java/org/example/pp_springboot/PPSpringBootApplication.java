package org.example.pp_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class PPSpringBootApplication {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(PPSpringBootApplication.class.getName());

        SpringApplication.run(PPSpringBootApplication.class, args);

        logger.info("Приложение запустилось! Откройте страницу http://localhost:8080/");
    }

}
