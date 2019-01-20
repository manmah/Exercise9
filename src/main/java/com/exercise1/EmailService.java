package com.exercise1;

import com.maher.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    /**
     * here we write Documentation and it will be showed as HTML
     *
     */


    private  ModifiedGreetingService greetingsService;

    public EmailService( @Qualifier("morningGreetingService") ModifiedGreetingService greetingsService) {
        this.greetingsService = greetingsService;
    }


    public void sendEmail(String name){
         greetingsService.greet(name);
    }




}
