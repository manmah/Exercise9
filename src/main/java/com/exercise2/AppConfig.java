package com.exercise2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    @Order(1)
    GreetingServiceImp morningGreetingService(){
        return new GreetingServiceImp("Good Morning");
    }
    @Bean@Order(2)
    GreetingServiceImp eveningGreetingService(){
        return new GreetingServiceImp("Good Evening");
    }


}
