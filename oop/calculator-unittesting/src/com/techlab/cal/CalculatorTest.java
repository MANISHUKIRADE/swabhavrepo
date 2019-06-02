package com.techlab.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class CalculatorTest {
	Calculator mycalculator = new Calculator();
	@Rule
    public ExpectedException thrown = ExpectedException.none();


	@Test
	void throwsExceptionWhenoddnumbers() {
		 // arrange
        thrown.expect(IllegalArgumentException.class);
    
        thrown.expectMessage("odd number are not allowed");
        // act
        mycalculator.caculate_cube_of_EvenNo(11);
    }

	
}
