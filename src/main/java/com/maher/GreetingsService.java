package com.maher;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class GreetingsService {

    public String greet(String name){
        return ("Hallo " + name);
    }
}
