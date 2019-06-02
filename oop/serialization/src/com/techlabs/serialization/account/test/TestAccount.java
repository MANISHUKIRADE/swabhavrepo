package com.techlabs.serialization.account.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.techlabs.serialization.account.Account;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account("manish", "12345", 2000, "thane");
		account.deposite(100);
		account.withdraw(1000);
		printdetails(account);
		try {
		FileOutputStream output = new FileOutputStream("E:\\SWABHAV REPOSITORY\\oop\\serialization\\src\\Bank.ser");
		ObjectOutputStream out = new ObjectOutputStream(output);
		out.writeObject(account);
		out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}

	public static void printdetails(Account account) {
		System.out.println("name  "+account.getName()+"Account no  "+ account.getAccno()+"amount  "+account.getAmount()+"location   "+account.getLocation());
		}
}
