package com.techlabs.collection.test;

import java.util.HashSet;

import com.techlabs.lineitem.LineItem;

public class TestHashSet {
	public static void main(String[] args) {
		HashSet<LineItem> cart = new HashSet<LineItem>();
		
		cart.add(new LineItem("Book", 100, 10));
		cart.add(new LineItem("Book",100,10));
		cart.add(new LineItem("Book", 100, 10));
		System.out.println(cart.size());
	}

}
