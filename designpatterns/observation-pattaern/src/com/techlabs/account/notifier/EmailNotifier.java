 package com.techlabs.account.notifier;

import com.techlabs.account.Account;
import com.techlabs.account.BalanceNotifier;

public class EmailNotifier implements BalanceNotifier {
public EmailNotifier() {
	// TODO Auto-generated constructor stub
}

	@Override
	public void update(Account acc) {
		// TODO Auto-generated method stub
		System.out.println("Customer your account balance is"+acc);
	}

}
