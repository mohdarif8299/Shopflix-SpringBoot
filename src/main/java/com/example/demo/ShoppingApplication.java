package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.spring.constants.WebConstants;

@SpringBootApplication
@ComponentScan({ "com.spring.controller", "com.spring.util" })
@EntityScan("com.spring.model")
@EnableJpaRepositories("com.spring.repository")
@CrossOrigin(origins = WebConstants.ALLOWED_URL)
public class ShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}
}
