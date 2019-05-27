package com.techlabs.collection.test;

import java.util.LinkedHashSet;

import com.techlabs.lineitem.LineItem;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<LineItem> cart = new LinkedHashSet<LineItem>();
		cart.add(new LineItem("Book", 100, 10));
		cart.add(new LineItem("Book",100,10));
		cart.add(new LineItem("Book", 10, 10));
		System.out.println(cart.size());
	}

}
