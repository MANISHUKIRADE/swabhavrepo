package com.techlabs.collection.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import com.techlabs.lineitem.LineItem;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<LineItem , Integer> cart = new HashMap<>();
	
		cart.put(new LineItem("Book", 100, 10),10);
		cart.put(new LineItem("Book",100,10),20);
		cart.put(new LineItem("Book", 100, 10),30);
		System.out.println(cart.size());
		
		
		
		
	}

}
