package com.techlabs.cubeeven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator mycalculator=new Calculator();
		assertEquals(8, mycalculator.cubeEvenNo(2));
	}

}
