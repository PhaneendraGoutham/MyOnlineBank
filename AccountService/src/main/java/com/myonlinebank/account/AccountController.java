package com.myonlinebank.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/accountservice")
@EnableConfigurationProperties(ExternalConfigProperties.class)
public class AccountController {

	@Autowired
	ExternalConfigProperties externalConfig;

	@Autowired
	DiscoveryClient discoveryClient;

	@GetMapping(value = "/accounts", produces="application/JSON")
	public Account fetchAccountDetails() {

		List<ServiceInstance> serviceIntanceList = discoveryClient.getInstances("transactionhistory");

		String txnHistoryURI = serviceIntanceList.stream().findFirst().get().getUri().toString();

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<TransactionHistory>> responseEntity = restTemplate.exchange(txnHistoryURI + "/transactionhistoryservice/transactions", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<TransactionHistory>>() {
				});

		Account myAccount = new Account("102034", "Savings", "", 20.00, responseEntity.getBody());

		if (externalConfig.getAccountDescription() != null) {
			myAccount.setAccountDescription(externalConfig.getAccountDescription());
		}

		return myAccount;
	}

}
