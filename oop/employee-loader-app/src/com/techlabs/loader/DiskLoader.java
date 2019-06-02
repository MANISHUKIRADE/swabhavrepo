package com.techlabs.loader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DiskLoader implements Loader {

	private String filename;
	@Override
	public Set<String> Loader(String filename) {
		this.filename=filename;

		Set<String> myhashset = new HashSet<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			try {
				while(br.readLine()!=null) {
					myhashset.add(br.readLine());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myhashset;
	}

}