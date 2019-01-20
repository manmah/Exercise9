package com.exercise2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.io.IOException;
import java.util.Date;

public class App {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TimeAwareGreetingService bean = context.getBean(TimeAwareGreetingService.class);
        bean.greet(" Mano");

        Environment env = context.getEnvironment();
        System.out.println(env.getProperty("MY_AWESOME_VAR"));

        SomeClass some = context.getBean(SomeClass.class);




    }
}
