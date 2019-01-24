package com.healthcare.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan(basePackages  = {"com.healthcare"})
@EntityScan(basePackages  = {"com.healthcare.domain"})
@EnableJpaRepositories(basePackages  = {"com.healthcare.repository","com.healthcare.service","com.healthcare.controller","com.healthcare.DTO","com.healthcare.domain"})
public class HealthCareDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HealthCareAssignmentApplication.class, args);
		SpringApplication app = new SpringApplication(HealthCareDemoApplication.class);
		System.out.println("started-------------");
		Environment env = app.run(args).getEnvironment();
		System.out.println("application ** "+env.getProperty("spring.datasource.url"));
		env.getProperty("url");
		System.out.println("ended-------------");
	}

}

