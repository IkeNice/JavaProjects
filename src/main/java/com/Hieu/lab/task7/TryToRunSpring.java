package com.Hieu.lab.task7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class TryToRunSpring {
    public static void main(String[] args) {
//        SpringApplication.run(TryToRunSpring.class, args); // использовать порт по умолчанию
        SpringApplication app = new SpringApplication(TryToRunSpring.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8083")); //использовать указанный порт
        app.run(args);
    }
}
