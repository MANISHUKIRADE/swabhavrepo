package com.techlabs.employee;

public class Manager extends Employee {

	public Manager(double basic_salary, String emp_id, String emp_name) {
		super(basic_salary, emp_id, emp_name,EmployeeType.MANAGER);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateAnnualSalary() {
		// TODO Auto-generated method stub
		int hra = 40;
		int ta = 30;
		int da = 20;
		basic_salary = getBasic();
		double annual_income = basic_salary * 12 + (basic_salary * (hra + ta + da) / 100);
		return annual_income;
	}

}
