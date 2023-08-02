package com.example.properties.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesConfig {
    @Bean
    CommandLineRunner commandLineRunner(PropertiesRepository propertiesRepository){
        return args -> {

        };
    }
}
