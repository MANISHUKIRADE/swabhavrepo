package com.techlabs.employetest;

import com.techlabs.employee.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Manager manager1 = new Manager(23000, "man123", "manager");
		Developer developer = new Developer(15000, "ddlsl12", "developr");
		Accountant accountan = new Accountant(2000, "acc1", "accountanr");
		printdetails(manager1);
		printdetails(developer);

	}

	public static void printdetails(Employee emp) {
		System.out.println("employee ID " + emp.getEmployeeId());
		System.out.println("emp name " + emp.getempName());
		System.out.println("emp_annual salary " + emp.calculateAnnualSalary());
		System.out.println("emptype="+emp.getEmpType());
	}
}
