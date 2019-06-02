package com.techlabs.employeedesign;

public class TestData {
	public static void main(String[] args) {

		DataAnalyzer analyzer = new DataAnalyzer(new Parser(new DiscLoader("Data\\data")));

		System.out.println(analyzer.getMaxSalary());
		System.out.println(analyzer.getDeptWiseEmp());
		System.out.println(analyzer.getDesignwiseEmpl());

	}
}
