package com.techlabs.loader;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmployeeParser {
	private List<Employee> myemplist = new ArrayList<Employee>();
	private Loader loader;
	

	public List<Employee> EmployeeParser(Loader loader) {
		this.loader = loader;
		
		
		List<Employee> emplist = new ArrayList<Employee>();
		List<String> list = new ArrayList<String>(loader.Loader("C:\\Users\\MANISH\\Desktop\\data.txt"));
		int index = 0;
		for(String str: list) {
			String[] splitdata = str.split(",");
			
			emplist.add(new Employee(Integer.parseInt(splitdata[0]),splitdata[1],splitdata[2],Double.parseDouble(splitdata[3]),splitdata[4]));
		
		
		}

		
		return emplist;
		
	}
	
	}
	

