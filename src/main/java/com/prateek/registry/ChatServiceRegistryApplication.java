package com.prateek.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ChatServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatServiceRegistryApplication.class, args);
	}

}
