package com.vincent.dispring.controllers;

import com.vincent.dispring.services.GreetingService;

public class SetterInjectedController {
    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
