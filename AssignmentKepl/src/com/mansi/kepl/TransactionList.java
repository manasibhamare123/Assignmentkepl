package com.mansi.kepl;

import java.util.Scanner;
import com.mansi.kepl.*;

public class TransactionList {
	public static void main(String[] args){
		TransactionsManagement transactionManager=new TransactionsManagement();
		
		Scanner scan=new Scanner(System.in);
		int menuChoice=0;
		
		do {
			showMenu();
			menuChoice=scan.nextInt();
			switch(menuChoice) {
			case 1: {				
					System.out.println("Enter Account Details");
					System.out.print("Enter Customer Name: ");
					scan.nextLine();
					String customerName=scan.nextLine();
					System.out.print("Enter Opening Balance: ");
					double openingAccountBalance=scan.nextDouble();
					
					Account account=new Account();
					account.setAccountNumber(++TransactionsManagement.lastAccountNumber);
					account.setAccountBalance(openingAccountBalance);
					account.setCustomer(customerName);
					transactionManager.createAccount(account);
					System.out.println("");
					System.out.println("Your Account Number is "+ TransactionsManagement.lastAccountNumber);
					System.out.println("");
				}
				break;
			case 2:{
					double withdrawAmount=0;
					System.out.print("Enter Your Account Number: ");
					int accountNumber=scan.nextInt();
					System.out.print("Enter Amount: ");
					withdrawAmount=scan.nextDouble();
					transactionManager.withdraw(accountNumber, withdrawAmount);
				}
				break;
			
			case 3:{				
					double creditAmount=0;
					System.out.print("Enter Your Account Number: ");
					int accountNumber=scan.nextInt();
					System.out.print("Enter Amount: ");
					creditAmount=scan.nextDouble();
					transactionManager.deposit(accountNumber, creditAmount);
				}
				break;
			
			case 4:
				System.out.print("Enter Your Account Number: ");
				int accountNumber=scan.nextInt();
				transactionManager.getBalance(accountNumber);
				break;
			
			case 5:
				transactionManager.showAllAccount();
				break;
				
			case 9:
				System.out.println("Thanking you for using KEPL Banking Services! Visit Again");
				break;
				
			default:
				System.out.println("Invalid Input!! Select Correct option from below Menu!");
				break;
			}
			
			
		}while(menuChoice!=9);
		
		scan.close();
		
	}
	
	public void addDummyRecords(TransactionsManagement transactionManager) {
		String[] customerNames= {"Kpel-Client1","Kpel-Client2","Kpel-Client3","Kpel-Client4","Kpel-Client5"};
		double[] accountBalances= {2000,4000,8000,16000,32000};
		
		for(int i=0;i<customerNames.length;i++) {
			Account account=new Account();
			account.setAccountNumber(TransactionsManagement.lastAccountNumber+1);
			account.setCustomer(customerNames[i]);
			account.setAccountBalance(accountBalances[i]);
			TransactionsManagement.lastAccountNumber+=1;
			
			transactionManager.createAccount(account);
		}
	}
	public static void showMenu()
	{
		// Printing statements displaying menu on console

		System.out.println("");
		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("                  MENU");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("1: Create Account");
		System.out.println("2: Cash WithDraw");
		System.out.println("3: Cash Deposit");
		System.out.println("4: Show Account Balance");
		System.out.println("5: Show All Account List");
		System.out.println("9: Exit program");
		System.out.println("");
		System.out.print("Enter your selection : ");
	}
}

