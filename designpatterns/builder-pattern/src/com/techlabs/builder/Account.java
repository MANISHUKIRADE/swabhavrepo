package com.techlabs.builder;

public class Account {
	private String name;
	private double amount;
	private int age;
	private String address;
	private String phone;

	public Account(AccountBuilder builder) {
		// TODO Auto-generated constructor stub
		this.name = builder.name;
		this.amount = builder.amount;
		this.age = builder.age;
		this.address = builder.address;
		this.phone = builder.phone;

	}

	public String getAddress() {
		return address;
	}

	public double getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("name  " + name + "amount" + amount + "age  " + age + "phone " + phone + "address " + address);
	}

}
