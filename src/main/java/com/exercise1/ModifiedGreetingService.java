package com.exercise1;

import org.springframework.stereotype.Component;


public class ModifiedGreetingService {

    private final String greetingType;
    public ModifiedGreetingService(String greetingType){
        this.greetingType = greetingType;
    }

    public void greet(String name){
        System.out.println(greetingType + name);
    }

}
