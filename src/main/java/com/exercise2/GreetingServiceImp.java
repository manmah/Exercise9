package com.exercise2;


public class GreetingServiceImp implements GreetingsService {

    private final String greetingMessage;
    public GreetingServiceImp(String greetingMessage){
        this.greetingMessage = greetingMessage;
    }

    public void greet(String name){
        System.out.println(greetingMessage + name);
    }

}
