package cpm.techlabs.resumetester;

import java.io.IOException;

import cpm.techlabs.resumebuilder.ResumeBuilder;

public class resumetest {
	
	public static void main(String[] args) throws IOException {
		ResumeBuilder myresume = new ResumeBuilder();
		myresume.buildResume("manish", "email", "address", "mobnum");
	}

}
