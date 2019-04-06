package cpm.techlabs.resumebuilder;
import java.io.*;

public class ResumeBuilder {
	
	public void buildResume(String name,String email, String address, String mobno ) throws IOException {
		File resume = new File("F:\\ukird\\resume.html");
		FileWriter resumewriter = new FileWriter(resume);
		
		resumewriter.write("<HTML> <HEAD> <TITLE>Hunter S. Jobseeker</TITLE> </HEAD> <BODY BGCOLOR=”#FFFFFF”> <H1>Hunter S. Jobseeker</H1> <TABLE WIDTH=”100%”> ");
		resumewriter.write("<TD ALIGN=”left”"+address+"</TD>");
		resumewriter.close();
		
		
	}
}

  