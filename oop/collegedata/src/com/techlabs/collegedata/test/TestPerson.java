package com.techlabs.collegedata.test;

import com.techlabs.collegedata.Department;
import com.techlabs.collegedata.Professor;
import com.techlabs.collegedata.Student;

public class TestPerson {
	public static void main(String[] args) {
		Student student1 =new Student("manish","09/07/1997","mumbai",Department.IT);
		Professor professor1= new Professor("hiten","12/05/1998","mumbai",12300);
		
	}
	
	public void printdetails(Student std){
		System.out.println("name="+std.getName());
		System.out.println("dob="+std.getDob());
		System.out.println("address="+std.getAddress());
		System.out.println("department"+std.getDepartment());
		
	}
	public void printdetails(Professor prof) {
		System.out.println("name="+prof.getName());
		System.out.println("dob="+prof.getDob());
	}
	

}
