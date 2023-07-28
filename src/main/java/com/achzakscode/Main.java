package com.achzakscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping() // greet i need to do localost:8080/greet
    public GreetResponse greet(){
        GreetResponse response = new GreetResponse(
                "Hello",
                List.of("Java", "Golang", "Javascript"),
                new Person("Alex", 28, 30_000)
        );
        return response;
    }

    record Person (String name, int age, double savings){

    }
    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ){}

}
