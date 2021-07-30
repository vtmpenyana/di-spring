package com.vincent.dispring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"XI","default"})
@Service("i18nService")
public class I18nXistsongaGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Misava, Ahee!";
    }
}
