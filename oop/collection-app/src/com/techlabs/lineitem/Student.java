package com.techlabs.lineitem;

public class Student {

	private String name;
	private int roll_no;
	private int standard;

	public Student(String name, int roll_no, int standard) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.roll_no = roll_no;
		this.standard = standard;
	}
	
	public String getName() {
		return name;
	}
	public int getRollno() {
		return roll_no;
	}
	public int getStandard() {
		return standard;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if((this.roll_no==((Student)obj).getRollno())&& (this.standard==((Student)obj).getStandard()))
			return true;
		else  
			return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("\n name="+name+" rollno="+roll_no+"  standar="+standard);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(this.getRollno()+""+this.getStandard());
	}
	
}
