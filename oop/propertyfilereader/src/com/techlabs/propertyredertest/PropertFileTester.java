package com.techlabs.propertyredertest;

import com.techlabs.propertyreder.PropertyReader;

public class PropertFileTester {
	public static void main(String[] args) throws Throwable {
		String filename = "cofig.properties";
		
		PropertyReader printproperty = new PropertyReader();

		printproperty.getProprtyfile(filename);

		//printproperty.getProprtyfile(filename, properyname);

	}

}
