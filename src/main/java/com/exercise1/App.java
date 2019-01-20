package com.exercise1;

import com.maher.SatisfactionService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendEmail(" Mano");

    }
}
