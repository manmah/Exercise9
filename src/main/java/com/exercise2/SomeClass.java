package com.exercise2;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SomeClass {

    private final List<GreetingsService> greetingsService;

    public SomeClass(List<GreetingsService> greetingsService) {
        this.greetingsService = greetingsService;
    }
}
