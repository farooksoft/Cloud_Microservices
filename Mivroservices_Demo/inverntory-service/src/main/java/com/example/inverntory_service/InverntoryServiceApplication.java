package com.example.inverntory_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InverntoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InverntoryServiceApplication.class, args);
	}

}
