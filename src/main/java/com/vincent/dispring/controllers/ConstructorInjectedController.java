package com.vincent.dispring.controllers;

import com.vincent.dispring.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
