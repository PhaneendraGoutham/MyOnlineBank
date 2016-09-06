package com.myonlinebank.account;

public class Account   {

	private String accountNumber;
	private String accountType;
	private String accountDescription;
	private Double accountBalance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountDescription() {
		return accountDescription;
	}
	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Account(String accountNumber, String accountType, String accountDescription, Double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountDescription = accountDescription;
		this.accountBalance = accountBalance;
	}
	
	
}
