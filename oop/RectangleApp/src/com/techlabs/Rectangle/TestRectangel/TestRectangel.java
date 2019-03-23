package com.techlabs.Rectangle.TestRectangel;

import java.lang.*;
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

	public static void printDetails(Rectangle r) {
		System.out.println(r.getClass().getName());
		System.out.println(r.hashCode());
		System.out.println("height=" + r.getHeight());
		System.out.println("width=" + r.getWidth());
		System.out.println("colour=" + r.getColour());
		System.out.println(r.calculateArea());

	}

}
