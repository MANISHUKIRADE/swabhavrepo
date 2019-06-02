package com.techlabs.lineitem.app;

public class Product { 
	private String name;
	private int id;
	private double cost;
	private double discount;
	public Product(String name,int id,double cost,double discount) {
		this.name=name;
		this.id=id;
		this.discount=discount;
		this.cost=cost;
	
	}
	public Product (int is,int id1,int id2,int id3) {
		throw new IllegalArgumentException();
	}
	
	public String getName(){
		return name;
	}
	public int getid() {
		return id;
	}
	public double getCost() {
		return cost;
	}
	public double getDiscount() {
		return discount;
	}
	
	public double finalProductCost() {
		return cost-((cost*discount)/100);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("product name ="+name+"\n productdiscoune="+discount+"\n productcost"+cost+"\n totalcostofproduct"+this.finalProductCost());
	}
	
	
	

}
