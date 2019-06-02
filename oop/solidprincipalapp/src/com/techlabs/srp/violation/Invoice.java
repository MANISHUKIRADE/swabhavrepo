package com.techlabs.srp.violation;

public class Invoice {
	private int no;
	private String name;
	private double cost;
	private double discount;
	private double gst;
	public Invoice(int no,String name,double cost,double discount,double gst) {
		this.no=no;
		this.name=name;
		this.cost=cost;
		this.discount=discount;
		this.gst=gst;
		
	}
	public double calculateDiscount(){
		return cost*discount;
	}

	public double calculateGst() {
		return cost*gst;
	}
	
	public double calculateTotalCost() {
		return cost-this.calculateDiscount()+this.calculateGst();
		
	}
	
	

	public void printInvoice() {
		System.out.println("Invoice ID  "+no);
		System.out.println("name of Customer "+name);
		System.out.println("cost  "+cost);
		System.out.println("discount  "+discount*100+"%");
		System.out.println("Gst   "+gst+"%");
		System.out.println("Discount amount  "+this.calculateDiscount());
		System.out.println("GST amount  "+this.calculateGst());
		System.out.println("Invoice Cost   "+this.calculateTotalCost());
	}
}
