package com.myonlinebank.transactionhistory;

import java.util.Date;

public class TransactionHistory {
	
	private Double transactionAmount;
	private String description;
	private Date transactionDate;
	
	
	public TransactionHistory(Double transactionAmount, String description, Date transactionDate) {
		super();
		this.transactionAmount = transactionAmount;
		this.description = description;
		this.transactionDate = transactionDate;
	}
	
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
}
