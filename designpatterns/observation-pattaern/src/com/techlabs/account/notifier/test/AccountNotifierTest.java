package com.techlabs.account.notifier.test;

import com.techlabs.account.Account;
import com.techlabs.account.notifier.SmsNotifier;

public class AccountNotifierTest {
	public static void main(String[] args) {
		Account acc = new Account("1234", "mnas", 10000);
		SmsNotifier smsnotifier = new SmsNotifier();
		acc.registerSubscriber(smsnotifier);
		acc.withdraw(500);
	}

}
