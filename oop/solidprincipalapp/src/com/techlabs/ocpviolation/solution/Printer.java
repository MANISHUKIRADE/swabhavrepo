package com.techlabs.ocpviolation.solution;

public class Printer {
	public Printer(FixedDeposit fixdposit1) {
		System.out.println("name  "+fixdposit1.getName());
		System.out.println("principle "+fixdposit1.getPrinciple());
		System.out.println("Duration  "+fixdposit1.getDuration());
		System.out.println("simple interes  "+fixdposit1.calculateSimpleInterest());

		// TODO Auto-generated constructor stub
	}

	public void Printer(FixedDeposit fixdeposit) {
		System.out.println("name  "+fixdeposit.getName());
		System.out.println("principle "+fixdeposit.getPrinciple());
		System.out.println("Duration  "+fixdeposit.getDuration());
		System.out.println("simple interes  "+fixdeposit.calculateSimpleInterest());
	}

}
