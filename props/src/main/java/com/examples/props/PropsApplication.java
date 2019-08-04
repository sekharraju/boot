package com.examples.props;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class PropsApplication {


	public static void main(String[] args) {

			SpringApplication application = new SpringApplicationBuilder(PropsApplication.class)
					.properties("spring.config.name:config1,config2,config3",
							"spring.config.location:classpath:/config,classpath:/",
							"spring.cloud.bootstrap.name:boot1,boot2",
							"spring.cloud.bootstrap.location:classpath:/boot.properties")
					.build();
			application.setAdditionalProfiles("sandbox");
			application.run(args);
	}

}

