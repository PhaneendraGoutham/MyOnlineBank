package com.myonlinebank.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accountservice")
@EnableConfigurationProperties(ExternalConfigProperties.class)
public class AccountController {
	
	@Autowired
	ExternalConfigProperties externalConfig;
	
    @GetMapping(value="/accounts")
	public Account fetchAccountDetails(){
    	
    	Account myAccount = new Account("102034", "Savings", "", 20.00);
    	
    	if(externalConfig.getAccountDescription()!=null){
    		myAccount.setAccountDescription(externalConfig.getAccountDescription());
    	}
    	
    	return myAccount;
    }

}
