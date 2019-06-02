package com.techlabs.serialization.account.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.techlabs.serialization.account.Account;

public class TestSerialization {
	public static void main(String[] args) {
		try {
			System.out.println("file reading from bank.ser");
			FileInputStream fis = new FileInputStream("E:\\SWABHAV REPOSITORY\\oop\\serialization\\src\\Bank.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
		
			Object one = ois.readObject();
			Account obj=(Account)one;
			TestAccount ta=new TestAccount();
			ta.printdetails(obj);
			ois.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
