package com.maher;


import jdk.nashorn.internal.objects.annotations.Property;
import org.kohsuke.github.GitHub;
import org.omg.CORBA.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@EnableScheduling
public class AppConfig {

    @Bean
    GitHub gitHub() throws IOException {
        return GitHub.connectUsingOAuth("17463b1aab1b47229e887f64559a40c4b80372c7");
    }

}
