package com.vincent.dispring.controllers;

import com.vincent.dispring.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
