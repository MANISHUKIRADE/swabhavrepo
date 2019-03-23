package com.techlabs.Rectangle;

public class Rectangle {
	private int height;
	private int width;
	private String colour;

	public void setHeight(int h) {
		height = Check(h);
	}

	public void setWidth(int w) {
		width = Check(w);
	}

	public void setColour(String str) {
		if (str.equalsIgnoreCase("RED") || str.equalsIgnoreCase("GREEN") || str.equalsIgnoreCase("BLACK")) {
			colour = str;

		} else {
		}
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public String getColour() {
		return colour;
	}

	public int calculateArea() {
		int a = height * width;
		return a;
	}

	public int Check(int a) {
		if ((a >= 0 && a <= 100)) {
			return a;

		} else if (a > 100)
			return 100;
		else {
			return 0;
		}

	}

	
}