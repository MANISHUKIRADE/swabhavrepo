package com.techlabs.lineitem.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Oreder {
	private Date date;
	private int id;
	private List<LineItem> items = new ArrayList<LineItem>() ;
	private List<LineItem> temp;
	
	public Oreder(Date date,int id) {
		// TODO Auto-generated constructor stub
		this.date=date;
		this.id=id;
		
		
	}
	
	
	
	public Date getDate(){
	return date;
	}
	
	public int getId() {
		return id;
	}
	public List<LineItem> getLineItems(){
		return items;
	}
	
	public void addLineItem(LineItem lineitem) {
		if(items.size()==0) {
			items.add(lineitem);
		}
		else {
		int index = 0;
		int a=1;
		for (int i =0;i<items.size() && a!=0;i++) {
			if(items.get(i).getProduct().getName().equalsIgnoreCase(lineitem.getProduct().getName())) {
				a=0;
				index++;
				
				
			}
			
				
		
			
		}
		if(a==0) {
			items.get(index-1).setQuantity(items.get(index-1).getQuantity()+lineitem.getQuantity());
		}
		else
			items.add(lineitem);
		}
			
	}
	public double cheoutPrice(){
		double price =0;
		for(LineItem lineitem: items) {
			price = price+lineitem.totalCost();
		}
		return price;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("\n Oreder date"+date+"order id"+id+"lineitem"+items);
	}
	
	public boolean checkLineItem(LineItem lineitem) {
		boolean value = false;
		for(LineItem templineitem : items) {
			if(templineitem.getProduct().getid()==lineitem.getProduct().getid()) {
				value= true;
				break;
			}
			else value=false;
			
			
		}
		return value;

}

}