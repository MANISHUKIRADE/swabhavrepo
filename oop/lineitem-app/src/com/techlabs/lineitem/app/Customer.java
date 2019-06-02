package com.techlabs.lineitem.app;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;

	private List<Oreder> listorder = new ArrayList<Oreder>();

	public Customer(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public List<Oreder> gerList() {
		return listorder;
	}

	public void addOrder(Oreder order) {
		listorder.add(order);
	}

}
