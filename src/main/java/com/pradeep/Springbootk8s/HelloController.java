package com.pradeep.Springbootk8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Hello hello(){
        Hello hello = new Hello();
        hello.setMessage("Good morning!");
        hello.setName("Spring Boot ");
        return hello;
    }
}
