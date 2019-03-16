package com.techlabs.basic;

public class TestOverloading {
	public static void main(String[] args) {
	/*	int i = 1;
		float f = (float) 1.2;
		char c = 'c';
		char a[] = { 'a', 'b' };
		String b = "abc"; */
		printThis(10); 
		printThis((float)10.5);
		printThis(10.55f);
		printThis(true);
		printThis("delta");
	}

	public static void printThis(int x) {
		System.out.println(x);
	}

	public static void printThis(char x) {
		System.out.println(x);
	}

	public static void printThis(String x) {
		System.out.println(x);
	}

	public static void printThis(char x[])

	{
		System.out.println(x);
	}

	public static void printThis(float f) {
		System.out.println(f);
	}
	public static void printThis(boolean b){
		System.out.println(b);;
	}

}
