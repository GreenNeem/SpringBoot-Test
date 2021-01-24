package com.client.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		System.out.println("zarchi from client PJ");
		SpringApplication.run(ClientApplication.class, args);
	}

}
