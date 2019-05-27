package com.techlabc.account;

public class InsufficientFundException extends RuntimeException {


	public InsufficientFundException(Account account) {
		// TODO Auto-generated constructor stub
		
		super("your account no"+account.getAccountno()+" having insufficient balance");
			
		}
	
/*	@Override
	public String getMessage() {
		return  ("your account no having insufficient balance");
	}*/
	}

	

