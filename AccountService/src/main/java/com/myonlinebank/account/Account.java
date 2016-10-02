package com.myonlinebank.account;

import java.util.List;

public class Account   {

	private String accountNumber;
	private String accountType;
	private String accountDescription;
	private Double accountBalance;
	private List<TransactionHistory> transactionHistoryList;
	
	public Account(String accountNumber, String accountType, String accountDescription, Double accountBalance,
			List<TransactionHistory> transactionHistoryList) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountDescription = accountDescription;
		this.accountBalance = accountBalance;
		this.transactionHistoryList = transactionHistoryList;
	}
	public List<TransactionHistory> getTransactionHistoryList() {
		return transactionHistoryList;
	}
	public void setTransactionHistoryList(List<TransactionHistory> transactionHistoryList) {
		this.transactionHistoryList = transactionHistoryList;
	}
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

	
	
}
