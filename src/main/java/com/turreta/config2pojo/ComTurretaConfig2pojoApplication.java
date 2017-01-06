package com.turreta.config2pojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class ComTurretaConfig2pojoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ComTurretaConfig2pojoApplication.class, args);
		FirstConfig config = (FirstConfig)context.getBean("firstConfig");
		System.out.print(config);
	}
}
