package com.client.client;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/client/people")
public class HelloController{

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }

}