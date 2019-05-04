package com.jk.explore.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:custom-configuration.properties")
public class PropertiesConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "basicDatasourceConfig")
    public BasicDatasourceConfigProperties basicDatasourceConfigProperties() {
        return new BasicDatasourceConfigProperties();
    }
}
