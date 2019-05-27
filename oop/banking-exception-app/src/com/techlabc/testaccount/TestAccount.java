package com.techlabc.testaccount;

import com.techlabc.account.Account;
import com.techlabc.account.InsufficientFundException;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account("123", "manish", 1000);
		try {
			account.withdraw(1000);
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
