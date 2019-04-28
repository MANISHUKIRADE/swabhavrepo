package com.techlabs.employee;

public class Developer extends Employee {

	public Developer(double basic_salary, String emp_id, String emp_name) {
		super(basic_salary, emp_id, emp_name,EmployeeType.DEVELOPER);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateAnnualSalary() {
		// TODO Auto-generated method stub
		int pa = 30;
		double annual_income = basic_salary * 12 + basic_salary * (pa / 100);
		return annual_income;
	}

}
