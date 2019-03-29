package com.techlabs.testcircle;

import com.techlabs.circle.*;

public class TestCircle {
	public static void main(String args[]) {

		Circle circle = new Circle();

		circle.setColour(ColorCategory.RED);
		circle.setRadius(2.7);

		System.out.println("colour=" + circle.getColour());
		System.out.println("colour=" + circle.getRadius());
		System.out.println("area=" + circle.calculateArea());

	}

}
