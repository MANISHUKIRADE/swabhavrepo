package com.techlabs.account;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accno;
	private  String name;
	private double balance;
	private List<BalanceNotifier> subscriber = new ArrayList<BalanceNotifier>();
	
	public Account(String accno ,String name,double balance) {
		// TODO Auto-generated constructor stub
		
	this.accno=accno;
	this.name=name;
	this.balance=balance;
	}
	public String getAccno() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public void registerSubscriber(BalanceNotifier subscribers) {
		subscriber.add(subscribers);
	}
	public void deposite(double amount) {
		balance=balance+amount;
		for(BalanceNotifier temp : subscriber) {
			temp.update(this);
		}
	}
	public void withdraw(double amount ) {
		balance=balance-amount;
		for(BalanceNotifier temp : subscriber) {
			temp.update(this);
		}
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("name "+ name+"accno  "+accno+"balance= "+balance);
	}
	

}
