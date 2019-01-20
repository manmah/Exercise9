package com.exercise2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    /**
     * here we write Documentation and it will be showed as HTML
     *
     */


    private GreetingServiceImp greetingsService;

    public EmailService( @Qualifier("morningGreetingService") GreetingServiceImp greetingsService) {
        this.greetingsService = greetingsService;
    }


    public void sendEmail(String name){
         greetingsService.greet(name);
    }




}
