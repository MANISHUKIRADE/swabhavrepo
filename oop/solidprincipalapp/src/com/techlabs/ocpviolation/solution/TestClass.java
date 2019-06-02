package com.techlabs.ocpviolation.solution;



public class TestClass {
	public static void main(String[] args) {
		FestivalRate festivalrate= new Diwali();
		FixedDeposit fixdposit1 = new FixedDeposit("manish", 10000, 10, festivalrate);

		System.out.println(fixdposit1.calculateSimpleInterest());
		Printer myprinter = new Printer(fixdposit1);

		
	}

}
