package com.maher;


import org.kohsuke.github.GitHub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    GitHub gitHub() throws IOException {
        return GitHub.connectUsingOAuth("b922102f3d486dc5de4166b646d23dff3ffcdec3");
    }
}
