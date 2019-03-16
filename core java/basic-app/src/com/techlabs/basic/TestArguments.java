package com.techlabs.basic;

public class TestArguments {
	public static void main(String[] names) {

		for (String s : names) {
			System.out.println("hello " + s);
			System.out.println("hello ".concat(s));

		}

	}
}
