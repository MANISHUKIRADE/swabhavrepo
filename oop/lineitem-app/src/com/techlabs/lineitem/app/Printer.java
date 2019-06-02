package com.techlabs.lineitem.app;

public class Printer {
	private Customer customer;
	public Printer(Customer customer) {

		System.out.println(customer.getName());
		
		System.out.println(customer.gerList());
		
	}

}
