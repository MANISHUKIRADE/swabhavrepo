package com.techlabs.srp.solution;

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
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public double getCost() { 
		return cost;
	}
	public double getDiscount() {
		return discount;
		
	}
	public double getGst() {
		return gst;
	}

}
