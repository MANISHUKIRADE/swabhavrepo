package com.techlabs.employee;

public abstract class Employee {
	protected double basic_salary;
	private String emp_id;
	private String emp_name;
	private EmployeeType emp_type;

	Employee(double basic_salary, String emp_id, String emp_name, EmployeeType emp_type) {
		this.basic_salary = basic_salary;
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_type = emp_type;
	}

	public String getEmployeeId() {
		return emp_id;
	}

	public String getempName() {
		return emp_name;
	}

	public double getBasic() {
		return basic_salary;
	}

	public abstract double calculateAnnualSalary();

	public  EmployeeType getEmpType() {
		return emp_type;
	}
}