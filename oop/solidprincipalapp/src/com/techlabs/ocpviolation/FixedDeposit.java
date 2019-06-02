package com.techlabs.ocpviolation;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private Festival festival;
	
	public FixedDeposit(String name, double principal, int duration,Festival festival) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.principal=principal;
		this.duration=duration;
		this.festival=festival;
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
	public Festival getFestival() {
		return festival;
	}
	
	public double calculateSimpleInterest() {
	double rate= getRate(festival);
	return (rate*principal*duration);
	}
	
	public double getRate(Festival festival) {
		double rate;
		if(festival==Festival.DIWALI) {
			rate= 0.07;
		}
		else if(festival==Festival.HOLI) {
			rate=0.08;
		}
		else {
			rate=0.7;
		}
		return rate;
	}
	
}
