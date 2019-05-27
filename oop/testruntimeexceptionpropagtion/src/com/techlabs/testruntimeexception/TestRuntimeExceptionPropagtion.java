package com.techlabs.testruntimeexception;

public class TestRuntimeExceptionPropagtion {
public static void main(String[] args) {
	m1();
	System.out.println("main ends");
}
public static void m1() {
	System.out.println("m1 ends");
	m2();

}

public static void m2()  {

	System.out.println("m2ends");
	m3();

}

public static void m3()  {
	System.out.println("m3 ends");
			throw new RuntimeException("m3fake");
	
}

}
