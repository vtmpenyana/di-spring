package com.vincent.dispring.controllers;

import org.springframework.stereotype.Component;

@Component
public class HelloController {
    public String greet(){
        return "Hello, World!";
    }
}
