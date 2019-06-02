package com.techlabs.loader.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.techlabs.loader.DiskLoader;
import com.techlabs.loader.Employee;
import com.techlabs.loader.EmployeeParser;
import com.techlabs.loader.Loader;

public class TestClassEmployeeLoader {
	public static void main(String[] args) {
		/*Set<String> myset = new HashSet<String>();
		Loader loader = new DiskLoader();
		myset = loader.Loader("C:\\Users\\MANISH\\Desktop\\data.txt");
		System.out.println(myset);
		System.out.println(myset.size());
*/
		List<Employee> mylist = new ArrayList<Employee>();
	    EmployeeParser empparse = new EmployeeParser();
		
		Loader loader1 = new DiskLoader();
		mylist = EmployeeParser(loader1);
		
	

	}

	
}
