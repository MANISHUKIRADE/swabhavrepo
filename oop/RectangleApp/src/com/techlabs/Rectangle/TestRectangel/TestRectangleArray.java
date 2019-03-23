package com.techlabs.Rectangle.TestRectangel;

import com.techlabs.Rectangle.Rectangle;

public class TestRectangleArray {
	public static void main(String[] args) {
		Rectangle rect[] = new Rectangle[3];

		Rectangle smallRectangle = new Rectangle();
		Rectangle bigRectangle = new Rectangle();

		smallRectangle.setHeight(100);
		smallRectangle.setWidth(100);
		smallRectangle.setColour("RED");

		bigRectangle.setHeight(50);
		bigRectangle.setWidth(70);
		bigRectangle.setColour("Green");

		rect[0] = smallRectangle;
		rect[1] = bigRectangle;
		try {
			for (Rectangle r : rect) {

				TestRectangel.printDetails(r);

			}
		} catch ( NullPointerException e) {
			System.out.println(e);
		}

	}

}