package com.techlabs.builder;

public class AccountBuilder {
	String name;
	double amount;
	int age;
	String address;
	String phone;

	public AccountBuilder(String name, double amount, String phone) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.amount = amount;
		this.address = address;
	}

	public AccountBuilder age(int age) {
		this.age = age;
		return this;
	}

	public AccountBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}

	public Account build() {
		Account account = new Account(this);
		return account;

	}

}
