package com.techlabs.icrudable;

public class DatabseOperation {

	public static void main(String[] args) {
		doDbOperation(new InvoiceDB());
		doDbOperation(new CustomerDB());
	}

	private static void doDbOperation(Icrudable x) {
		x.create();
		x.delete();
		x.update();
		x.read();
		// TODO Auto-generated method stub

	}

}
