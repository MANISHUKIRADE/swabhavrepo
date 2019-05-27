package com.techlabs.collection.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestCollection {
	public static void main(String[] args) {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem("sunglasses",1000,1));
		cart.add(new LineItem("pen", 100, 5));
		cart.add(new LineItem("mbilecover", 200, 1));
		cart.add("mahesh");
		cart.add(123);
		
		
		for(Object obj : cart) {
		LineItem lineitem = (LineItem) obj;
		System.out.println("product"+lineitem.getProduct()+" price="+lineitem.getPrice()+" quantity="+lineitem.getQuantity()+"total cost"+lineitem.calculateTotalCost());
	}
	
	}
}
