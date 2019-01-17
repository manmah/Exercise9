package com.maher;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    GreetingsService greetingsService;

    public EmailService(GreetingsService greetingsService) {

        this.greetingsService = greetingsService;
    }


    public String sendEmail(String name){
        return greetingsService.greet(name) + "how do you like Redi School";
    }




}
