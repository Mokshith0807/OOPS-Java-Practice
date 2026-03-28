package com.mokshith.oops;

class BankAccount2 {
	private double balance;
	
	void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		} else {
			System.out.println("Amount must be greater than 0");
		}
	}
	
	void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Invalid withdraw amount");
		}
	}

	public double getBalance() {
		return balance;
	}
	
	
}
public class SecureBankAccSystem {
	public static void main(String[] args) {
		BankAccount2 acc = new BankAccount2();
		acc.deposit(2000.0);
		acc.withdraw(1000.0);
		
		System.out.println("Balance: " + acc.getBalance());
	}
}
