package com.techlabs.collection.test;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import com.techlabs.lineitem.LineItem;
import com.techlabs.lineitem.SortByPrice;

public class TestTreeSetGeneric {
	public static void main(String[] args) {
		
		TreeSet<LineItem> cart = new TreeSet<LineItem> (new SortByPrice());
		cart.add(new LineItem("Book", 1000, 10));
		cart.add(new LineItem("Boook",100,10));
		cart.add(new LineItem("Book", 100, 10));
		System.out.println(cart.size());
		
	
	
	}


}
