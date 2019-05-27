package com.techlabs.collegedata;

import java.util.Date;

public class Professor extends Person implements SalareidEmployee {
	private double salary;

	public Professor(String name, String dob, String address, double salary) {
		super(name, dob, address);
		this.salary = salary;

		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public double calculateSalary() {
		return 12 * salary;

	}

}
