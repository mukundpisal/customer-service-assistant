package com.custSerAss.whatsappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
public class WhatsappDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WhatsappDemoApplication.class, args);
	}
}
