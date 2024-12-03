package com.sapiens.Microservices_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDemoApplication.class, args);
	}

}
