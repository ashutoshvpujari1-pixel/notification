package com.pt.notification.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {

    @Bean
    @Profile("dev")
    public String developmentBean() {
        return "Development Bean";
    }
    
    @Bean
    @Profile("test")
    public String testingBean() {
        return "Testing Bean";
    }

    @Bean
    @Profile("prod")
    public String productionBean() {
        return "Production Bean";
    }
}