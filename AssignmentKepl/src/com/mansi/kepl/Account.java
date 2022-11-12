package com.mansi.kepl;

import com.mansi.kepl.*;

public class Account {
	private int accountNumber;
//	private Customer Customer;
	private String customer;
	private double accountBalance;
	
	public Account() {	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accoutnNumber) {
		this.accountNumber = accoutnNumber;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Override
	public String toString() {
		return "Account [accoutnNumber=" + accountNumber + ", customer=" + customer + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
	
	
}
