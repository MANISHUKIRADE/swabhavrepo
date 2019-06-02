package com.techlabs.lineitem.app;

import java.util.ArrayList;
import java.util.List;

public class LineItem {
	private int id;
	private int quantity;
	private Product product ;
	public LineItem(int id, int quantity, Product product) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.quantity=quantity;
		this.product=product;
		
	}
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	
	
	public int getId() {
		return id;
	}
	public int getQuantity() {
		return quantity;
	}
	public Product getProduct(){
		return product;
	}
	
	public double totalCost() {
		
		return quantity*product.finalProductCost();
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("\n total Quantity="+quantity+"\n Total cost of ="+product.getName()+"is" +this.totalCost());
	}
		
	
		}
	


