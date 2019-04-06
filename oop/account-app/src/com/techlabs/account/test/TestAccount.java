package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestAccount {
	public static void main(String[] args) {
		Account acc1 = new Account("01954", "manish", 1000);
		printDetails(acc1);
		acc1.withdraw(600);
		printDetails(acc1);

	}

	public static void printDetails(Account acc) {
		System.out.println("name=" + acc.getName());
		System.out.println("accontno=" + acc.getAccountno());
		System.out.println("balance=" + acc.getBalnce());
		System.out.println(acc);
	}
	
	

}
