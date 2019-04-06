package com.techlabs.account;

public class Account {
	private String accountno;
	private String name;
	private double balance;
	private String string;

	public Account(String accountno, String name, double balance) {
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;

	}

	public Account(String accountno, String name) {
		this(accountno, name, 500);

	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		if ((balance - amount) >= 500) {
			balance = balance - amount;
			System.out.println("Transaction successful");
		} else {
			System.out.println("minimum balance should be 500");
		}

	}

	public String getName() {
		return name;
	}

	public String getAccountno() {
		return accountno;

	}

	public double getBalnce() {
		return balance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String tostringresult = super.toString();
		

		return "accountno=" + getName() + "name=" + getAccountno() + "balance=" + getBalnce()+"\r\n"+tostringresult;

	}

	@Override
	public boolean equals(Object obj) {

		Account acc;
		acc = (Account) obj;
		if (acc.getName().equals(this.getName()) && acc.getAccountno().equals(this.getAccountno())) {
			return true;
		} else {
			return false;

		}

	}

}
