package com.exercise1;


import org.kohsuke.github.GitHub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.io.IOException;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    @Primary
    ModifiedGreetingService morningGreetingService(){
        return new ModifiedGreetingService("Good Morning");
    }
    @Bean
    ModifiedGreetingService eveningGreetingService(){
        return new ModifiedGreetingService("Good Evening");
    }


}
