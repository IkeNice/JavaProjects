package com.Hieu.lab.task7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@SpringBootApplication
public class TryToRunSpring {

    @RequestMapping("/test")
    String page(){
        return "Test string";
    }

    public static void main(String[] args) {
//        SpringApplication.run(TryToRunSpring.class, args); // использовать порт по умолчанию
        // использовать указанный порт
        SpringApplication app = new SpringApplication(TryToRunSpring.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);
    }
}
