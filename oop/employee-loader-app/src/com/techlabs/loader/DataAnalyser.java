package com.techlabs.loader;

public class DataAnalyser {
	private EmployeeParser parser;
	public void  DataAnalyser(EmployeeParser parser) {
		this.parser=parser;
		
	}
	public void getData() {
		Loader loader = new DiskLoader();
		
		System.out.println(parser.EmployeeParser(loader));
	}

}
