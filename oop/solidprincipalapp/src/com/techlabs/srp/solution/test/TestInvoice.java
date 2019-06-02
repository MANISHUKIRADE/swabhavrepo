package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.Invoice;
import com.techlabs.srp.solution.InvoicePrinter;

public class TestInvoice {
	Invoice myinvoice = new Invoice(1, "manish", 1000, 0.20, 0.24);
	InvoicePrinter myprinter = new InvoicePrinter(myinvoice);
	

}
