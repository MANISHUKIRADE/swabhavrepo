package com.techlabs.employeedesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.util.StreamReaderDelegate;

public class WebLoader implements Loader {
	String link;

	public WebLoader(String link) {
		// TODO Auto-generated constructor stub
		this.link = link;
	}

	@Override
	public String load() {
		
		String line = "";
		String data;
		try {
			BufferedReader in = new BufferedReader(
					new InputStreamReader(new URL(link).openConnection().getInputStream()));
			while ((data = in.readLine()) != null) {
				line = line + data + "\n";
			}
			in.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return line.toString();
	}

}
