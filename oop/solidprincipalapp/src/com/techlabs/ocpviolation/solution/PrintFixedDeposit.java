package com.techlabs.ocpviolation.solution;

import com.techlabs.ocpviolation.FixedDeposit;

public class PrintFixedDeposit {
	public PrintFixedDeposit(FixedDeposit fixedeposit) {
		// TODO Auto-generated constructor stub
		System.out.println("Name  " + fixedeposit.getName());
		System.out.println("Principle  " + fixedeposit.getPrinciple());
		System.out.println("Duration  " + fixedeposit.getDuration());
		

		System.out.println("calculate Simple Interest " + fixedeposit.calculateSimpleInterest());

	}
}
