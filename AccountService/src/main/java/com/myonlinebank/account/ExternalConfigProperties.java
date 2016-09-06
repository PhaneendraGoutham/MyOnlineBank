package com.myonlinebank.account;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="account")
public class ExternalConfigProperties {
	
	private String accountDescription;

	public String getAccountDescription() {
		return accountDescription;
	}

	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	} 

}
