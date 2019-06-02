package com.techlabs.ocpviolation.solution;

import com.techlabs.ocpviolation.Festival;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private FestivalRate festival;
	private double rate;

	public FixedDeposit(String name, double principal, int duration, FestivalRate festival) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		rate = festival.getRate();
	}

	public String getName() {
		return name;
	}

	public double getPrinciple() {
		return principal;
	}

	public int getDuration() {
		return duration;
	}

	public double calculateSimpleInterest() {
		return (rate * principal * duration);
	}

}
