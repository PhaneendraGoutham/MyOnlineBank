package com.myonlinebank.transactionhistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountTransactionHistoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountTransactionHistoryServiceApplication.class, args);
	}
}
