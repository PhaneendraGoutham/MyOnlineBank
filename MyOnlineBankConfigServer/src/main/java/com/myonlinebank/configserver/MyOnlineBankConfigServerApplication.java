package com.myonlinebank.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyOnlineBankConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyOnlineBankConfigServerApplication.class, args);
	}
}
