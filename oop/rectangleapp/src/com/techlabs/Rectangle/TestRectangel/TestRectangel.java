package com.techlabs.Rectangle.TestRectangel;

import com.techlabs.Rectangle.*;

public class TestRectangel {

	public static void main(String args[]) {
		Rectangle smallRectangle = new Rectangle();
		Rectangle bigRectangle = new Rectangle();

		smallRectangle.setHeight(100);
		smallRectangle.setWidth(100);
		smallRectangle.setColour("RED");

		bigRectangle.setHeight(50);
		bigRectangle.setWidth(70);
		bigRectangle.setColour("Green");

		Rectangle temp = bigRectangle;
		temp.setHeight(100);
		temp = null;

		printDetails(smallRectangle);
		printDetails(bigRectangle);

	}

	public static void printDetails(Rectangle rectangle) {
		if (rectangle != null) {

			System.out.println(rectangle.getClass().getName());
			System.out.println(rectangle.hashCode());
			System.out.println("height=" + rectangle.getHeight());
			System.out.println("width=" + rectangle.getWidth());
			System.out.println("colour=" + rectangle.getColour());
			System.out.println(rectangle.calculateArea());

		}
	}
}