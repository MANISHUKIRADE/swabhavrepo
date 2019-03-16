package com.techlabs.basic;

public class TestMutation {
	public static void main(String[] args) {
		int marks[] = { 10, 20, 30 };
		int mark = 100;
		markZero(mark);
		System.out.println(mark);
		for (int n : marks) {
			System.out.println(n);
		}
		marksZero(marks);
		for (int n : marks) {
			System.out.println(n);
		}
	}

	public static void marksZero(int marks[]) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = 0;
		}
	}

	public static void markZero(int mark) {

		mark = 0;

	}

}
