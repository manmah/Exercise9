package com.maher;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SatisfactionService satisfactionService1 = context.getBean(SatisfactionService.class);
        satisfactionService1.satisfy();

    }
}
