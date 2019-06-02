package com.techlabs.srp.violationtest;

import com.techlabs.srp.violation.Invoice;

public class TestInvoice {
	public static void main(String[] args) {
		Invoice myinvoice = new Invoice(1, "manish", 1000, 0.1, 0.18);
		myinvoice.printInvoice();
	}

}
