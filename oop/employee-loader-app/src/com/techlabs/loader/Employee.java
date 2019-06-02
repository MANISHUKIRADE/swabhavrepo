package com.techlabs.loader;



public class Employee {
	private String employeeName;
	private int empId;
	private String doj;
	private String empdesignation;
	private Double salary;
	private int commission;
	private int deptNo;
	private int mngrId;
	
	
	
//	7654,'MARTIN','SALESMAN',7698,'28-SEP-81',1250,1400,30


	public Employee(int empid,String employeeName, String empdesignation, double salary,String doj2) {
		// TODO Auto-generated constructor stub
		this.employeeName=employeeName;
		this.empId=empid;
		this.doj=doj;
		this.empdesignation=empdesignation;
		this.salary=salary;
		this.commission=commission;
		this.deptNo=deptNo;
		this.mngrId=mngrId;

	}


	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmpId() {
		return empId;
	}

	public String getDoj() {
		return doj;
	}

	public String getEmpdesignation() {
		return empdesignation;
	}

	public Double getSalary() {
		return salary;
	}

	public int getCommission() {
		return commission;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public int getMngrId() {
		return mngrId;
	}


	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " empid: " + getEmpId() + " Name: " + getEmployeeName() + " salary: " + getSalary() + " designation "
				+ getEmpdesignation() + " doj:" + getDoj() + " managerId " + getMngrId() + " dept " + getDeptNo()
				+ " commission " + getCommission() + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + commission;
		result = prime * result + deptNo;
		result = prime * result + ((doj == null) ? 0 : doj.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empdesignation == null) ? 0 : empdesignation.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + mngrId;
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (commission != other.commission)
			return false;
		if (deptNo != other.deptNo)
			return false;
		if (doj == null) {
			if (other.doj != null)
				return false;
		} else if (!doj.equals(other.doj))
			return false;
		if (empId != other.empId)
			return false;
		if (empdesignation == null) {
			if (other.empdesignation != null)
				return false;
		} else if (!empdesignation.equals(other.empdesignation))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (mngrId != other.mngrId)
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

}
