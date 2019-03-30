package com.techlabs.testreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	public Class testclass;
	public   Reflection(Class obj){
		Class testclass = obj.getClass();
		
		
	}

	public void printMetaDataClass() {
		
		System.out.println(testclass.getName());
	}

	public void printMetaDataField() {
		System.out.println("no of field are");

		Field[] field = testclass.getFields();
		countprint(field);

		System.out.println("field::");

		for (Field tempfield : field) {

			System.out.println(tempfield.getName());
		}
	}

	public void printMetaDataDeclaredfield() {
		System.out.println("Declaredfield::");

		Field[] declrfield = testclass.getDeclaredFields();
		System.out.println("number of Declared field");
		countprint(declrfield);
		for (Field tempdeclrfield : declrfield) {
			System.out.println(tempdeclrfield.getName());
		}
	}

	public void printMetaDataMethod() {
		Method[] method = testclass.getMethods();

		System.out.println("number of methods");
		countprint(method);
		System.out.println("metods::");
		for (Method tempmethod : method) {
			System.out.println(tempmethod.getName());
		}
	}

	public void printMetaDataMethodChild() {
		
		Method[] method = testclass.getDeclaredMethods();
		System.out.println("Number of Methods Of current class are");
		countprint(method);
		System.out.println("metods Child::");
		for (Method tempmethod : method) {
			System.out.println(tempmethod.getName());
		}
	}
	

	

	public void countprint(Object obj[]) {
		int count = 0;
		for (Object tempobject : obj) {
			count++;

		}
		System.out.println("count " + count);
	}
}
