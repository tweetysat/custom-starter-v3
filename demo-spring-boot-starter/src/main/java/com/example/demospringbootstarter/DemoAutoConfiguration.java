package com.example.demospringbootstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAutoConfiguration {

    @Bean
    public DemoService demoService() {
        System.out.println("DemoService created...");
        return new DemoService();
    }

}
