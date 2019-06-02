package com.techlabs.lineitem.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.lineitem.app.Customer;
import com.techlabs.lineitem.app.LineItem;
import com.techlabs.lineitem.app.Oreder;
import com.techlabs.lineitem.app.Printer;
import com.techlabs.lineitem.app.Product;

public class TestClass {
	public static void main(String[] args) {

		Product product1 = new Product("pen", 1, 100, 10);
		Product product2 = new Product("Book", 2, 200, 20);
		SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");

		LineItem lineitem1 = new LineItem(1, 10, product1);
		LineItem lineitem2 = new LineItem(2, 11, product2);
		LineItem lineitem3 = new LineItem(1, 10, product1);
		Oreder order1 = null;
		try {
			order1 = new Oreder(ft.parse("09-07-2019"), 1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		order1.addLineItem(lineitem1);
		order1.addLineItem(lineitem2);
		order1.addLineItem(lineitem3);
		Customer customer = new Customer("Manish");
		customer.addOrder(order1);
		Printer printer= new Printer(customer);
		
				

	}

}
