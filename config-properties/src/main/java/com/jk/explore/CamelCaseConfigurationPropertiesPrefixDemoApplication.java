package com.jk.explore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class CamelCaseConfigurationPropertiesPrefixDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamelCaseConfigurationPropertiesPrefixDemoApplication.class, args);
    }

}
