package com.techlabs.collection.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.techlabs.lineitem.Student;

public class TestHashStudent  extends HashMap<Student, Student> {
	
	public static void main(String[] args) {
		HashMap<Student, Student> class1 = new HashMap<>();
		Student student1 = new Student("mans", 1, 1); 
		Student student2= new Student("nans",1,1);
		Student student3= new Student("absv", 10, 10);
		class1.put(student1, student2);
		class1.put(student1,student2);
		;
		System.out.println(class1.size());
		System.out.println(class1);
	}
	
	
	

}
