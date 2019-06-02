package com.techlabs.colllection.duplicatedataavoidance;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyReader {
	public void getProprtyfile(String filename) throws Throwable {

		FileReader filereader = new FileReader(filename);
		Properties fileproperties = new Properties();

		fileproperties.load(filereader);
		Set Propertyset = fileproperties.entrySet();

		Iterator visiteachproperty = Propertyset.iterator();

		while (visiteachproperty.hasNext()) {
			Map.Entry entry = (Map.Entry) visiteachproperty.next();
			System.out.println(entry.getKey() + " , " + entry.getValue());
		}

	}

	public void getProprtyfile(String filename, String properyname) throws IOException {
		FileReader fileReader = new FileReader(filename);
		Properties fileProperties = new Properties();
		
		fileProperties.load(fileReader);
		  System.out.println(fileProperties.getProperty("properyname"));  
		    
		

	}

}
