package com.techlabs.serialization.account;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = -1349860817921031473L;
	private String name;
	private String accno;
	private double amount;
	private String location;

	public Account(String name, String accno, double amount, String loaction) {
		this.accno = accno;
		this.name = name;
		this.location = loaction;
		this.amount = amount;
		// TODO Auto-generated constructor stub
	}

	public Account(String aacno, String name) {
		this(name, aacno, 500, "Mumbai");
		// TODO Auto-generated constructor stub
	}

	public String getAccno() {
		return accno;
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public void deposite(double amount) {
		this.amount = this.amount + amount;
	}

	public void withdraw(double amount) {
		if ((this.amount - amount) < 500) {
		} else {
			this.amount = this.amount - amount;
		}
	}

}
