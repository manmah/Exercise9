package com.exercise2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

@Component
@Order(3)
public class TimeAwareGreetingService implements GreetingsService{



    private final GreetingsService morningGreetingService;
    private final
    GreetingsService eveningGreetingService;

    public TimeAwareGreetingService(@Qualifier("morningGreetingService") GreetingsService morningGreetingService,@Qualifier("eveningGreetingService") GreetingsService eveningGreetingService) {
        this.morningGreetingService = morningGreetingService;
        this.eveningGreetingService = eveningGreetingService;
    }

    public void greet(String name) {
        Date date= new Date();
        int timNow = date.getHours();
        if(timNow < 16){
            morningGreetingService.greet(name);
        }
        else
            eveningGreetingService.greet("name");
    }
}
