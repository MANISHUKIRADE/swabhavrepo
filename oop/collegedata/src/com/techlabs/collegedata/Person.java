package com.techlabs.collegedata;

import java.util.Date;

public class Person {
	private String name;
	private String dob;
	private String address;
	
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public String getAddress() {
		return address;
	}
	Person(String name , String dob , String address){
		this.name=name;
		this.dob=dob;
		this.address=address;
		
	}
}
