package com.techlabs.employeedesign;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiscLoader implements Loader {
	String filename;

	public DiscLoader(String filename) {
				this.filename = filename;
	}

	@Override
	public String load() {
	
		String data;
		String line ="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));

			while (true) {
				data = br.readLine();

				if (data == null) {
					break;
				}
				line = line+data+"\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}

}

















