package com.maher;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    /**
     * here we write Documentation and it will be showed as HTML
     *
     */
    GreetingsService greetingsService;

    public EmailService(GreetingsService greetingsService) {

        this.greetingsService = greetingsService;
    }


    public String sendEmail(String name){
        return greetingsService.greet(name) + ": how do you like Redi School";
    }




}
