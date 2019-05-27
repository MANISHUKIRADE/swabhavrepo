package com.techlabs.exceptionproagation;

public class TestPropagtion {
	public static void main(String[] args) throws Exception {
		try {
		m1();
		}catch(Exception e) {System.out.println(e);}
		System.out.println("main ends");
	}

	public static void m1() throws Exception {
		System.out.println("m1 ends");
		m2();

	}

	public static void m2() throws Exception {

		System.out.println("m2ends");
		m3();

	}

	public static void m3() throws Exception {
		System.out.println("m3 ends");
				throw new Exception("m3fake");
		
	}

}