package com.techlabs.collegedata;

import java.util.Date;

public class Student extends Person {
	private Department department;
	public Student(String name, String dob , String address,Department department) {
		super(name,dob,address);
	this.department= department;
	
		// TODO Auto-generated constructor stub
		
	}
	
	public Department getDepartment() {
		return department;
	}
	
		
	

}
