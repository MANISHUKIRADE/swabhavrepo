package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestEqals {
	public static void main(String[] args) {
		Account acc1 = new Account("101","abc");
		Account acc2 = new Account("101","abc");
		System.out.println(acc1==acc1);
		System.out.println(acc1==acc2);
		System.out.println(acc1.equals(acc1));
		System.out.println(acc1.equals(acc2));
	}

}
