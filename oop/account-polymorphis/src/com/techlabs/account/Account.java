package com.techlabs.account;


public abstract class Account {
	private double account_number;
	private String account_holder_name;
	protected double balance;
	Account(double account_number,String account_holder_name,double balance){
		this.account_holder_name= account_holder_name;
		this.account_number= account_number;
		this.balance= balance;
	}
	
	public double getAccountNumber(){
	return account_number;
	}
	
	public String getaccountHolderName() {
		return account_holder_name;
	}
	public void deposit(double amount) {
		balance= balance+amount;
				
	}
	public double getBalance() {
		return balance;
	}
	public abstract void withdraw(double amount);
	


	
	
}
