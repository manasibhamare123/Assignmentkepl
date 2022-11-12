package com.mansi.kepl;

import java.util.LinkedList;
import com.mansi.kepl.*;

public class TransactionsManagement {
	LinkedList<Account> accountList;
	static int lastAccountNumber=1000;
	public TransactionsManagement() {
		accountList=new LinkedList<>();
	}
	
	
	public void createAccount(Account account) {
		if(findAccount(account.getAccountNumber()) == null) {
			accountList.add(account);
			System.out.println("Account Created Successfully");
			return;
		}
		
		System.out.println("Account Already Exists");
	}
	
	public Account findAccount(int accountNumber) {
		for(Account account : accountList) {
			if(account.getAccountNumber()==accountNumber) {
//				System.out.println(account);
				return account;
			}
		}
		return null;
	}
	
	public void showAllAccount() {
		for(Account account : accountList) {
			System.out.println(account);
		}
	}
	
	public void withdraw(int accountNumber, double amount) {
		if(findAccount(accountNumber) != null) {
			Account account =findAccount(accountNumber);
			 if(account.getAccountBalance()>=amount) {
				 account.setAccountBalance(account.getAccountBalance()-amount);
				 System.out.println("Debited Successfully");
				 return;
			 }
			 else {
				 System.out.println("Insufficient Account Balance!");
				 return;
			 }
		}
		System.out.println("Invalid Account Number: Account Doesn't Exists");
	}
	
	
	public void deposit(int accountNumber, double amount) {
		if(findAccount(accountNumber)!=null) {
			Account account=findAccount(accountNumber);
			account.setAccountBalance(account.getAccountBalance()+amount);
			System.out.println(amount+" Deposited Successfully");
			return;
		}
		System.out.println("Invalid Account Number: Account Doesn't Exists");
	}
	
	public boolean getBalance(int accountNumber) {
		if(findAccount(accountNumber)!=null) {
			System.out.println("Your Account Balance is: "+findAccount(accountNumber).getAccountBalance());
			return true;
		}
		System.out.println("Invalid Account Number: Account Doesn't Exists");
		return false;
	}
	
}
