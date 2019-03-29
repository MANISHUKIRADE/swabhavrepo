package test;

import oddevencheck.OddEvenPrinter;

public class OddEvenTester  {
	
	public static void main(String[] args) {
		OddEvenPrinter myprinter = new OddEvenPrinter();
		int limit=100;
		myprinter.evenPrint(limit);
		myprinter.oddPrint(limit);
	}

}
