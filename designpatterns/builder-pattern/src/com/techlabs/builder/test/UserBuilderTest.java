package com.techlabs.builder.test;

import com.techlabs.builder.Account;
import com.techlabs.builder.AccountBuilder;

public class UserBuilderTest {
	public static void main(String[] args) {
		AccountBuilder accbuilder = new AccountBuilder("manis", 1000, "8691983106");
		Account acc= new Account(accbuilder);
		System.out.println(acc);
	}

}
