package com.techlabs.srp.solution;

public class InvoicePrinter {
	public InvoicePrinter(Invoice myinvoice) {
		System.out.println("Invoice ID  "+myinvoice.getNo());
		System.out.println("name of Customer "+myinvoice.getName());
		System.out.println("cost  "+myinvoice.getCost());
		System.out.println("discount  "+myinvoice.getDiscount()*100+"%");
		System.out.println("Gst   "+myinvoice.getGst()+"%");
		System.out.println("Discount amount  "+myinvoice.calculateDiscount());
		System.out.println("GST amount  "+myinvoice.calculateGst());
		System.out.println("Invoice Cost   "+myinvoice.calculateTotalCost());

	}

}
