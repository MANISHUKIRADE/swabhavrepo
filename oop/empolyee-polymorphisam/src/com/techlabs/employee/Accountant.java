package com.techlabs.employee;

public class Accountant  extends Employee{

	public Accountant(double basic_salary, String emp_id, String emp_name) {
		super(basic_salary, emp_id, emp_name,EmployeeType.ACCOUNTAT);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateAnnualSalary() {
		int perk=20;
		double annual_income= basic_salary*12+basic_salary*(perk/100);
		return annual_income;
	}

}
