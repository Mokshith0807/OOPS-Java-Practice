package com.mokshith.oops;

class BankAccount {
	String name;
	double balance;
	
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited: "+ amount);
		 System.out.println("Updated Balance: " + balance);
	}
	
	void withdraw(double amount) {
		if(balance >= amount) {
			balance = balance - amount;
			System.out.println("Withdrawn: "+ amount);
			 System.out.println("Updated Balance: " + balance);
		} else {
			System.out.println("Insufficient Balance.");
		}
	}
	
	void checkBalance() {
		System.out.println("Current Balance: "+ balance);
		System.out.println("Account Holder: " + name);
	}
}
public class BankAccountSystem {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.name = "Mokshith";
		acc.balance = 1000;
		
		acc.deposit(500);
		acc.withdraw(500);
		acc.checkBalance();
	}
}
