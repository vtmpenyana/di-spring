package com.vincent.dispring.controllers;

import com.vincent.dispring.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloController {
    private final GreetingService greetingService;

    public HelloController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(){
        return greetingService.sayGreeting();
    }
}
