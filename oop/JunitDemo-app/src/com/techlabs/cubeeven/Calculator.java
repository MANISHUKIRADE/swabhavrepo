package com.techlabs.cubeeven;

public class Calculator {
	public double cubeEvenNo(int number) {
		if (number % 2 == 0) {
			return number * number * number;
		} else
			throw new OddNumberException(number);
	}

	public double roundup(double number) {
		double temp = number * 10;
		double lastdigit = number % 10;
		if (lastdigit < 5) {
			return (int) number;
		} else
			return ((int) number) + 1;

	}

}
