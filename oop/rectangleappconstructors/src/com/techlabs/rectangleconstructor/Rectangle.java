package com.techlabs.rectangleconstructor;

public class Rectangle {

	private final double height;
	private final double width;
	private final BorderType bordertype;

	public Rectangle(double newheight, double newwidth, BorderType border) {
		height = newheight;
		width = newwidth;
		bordertype = border;
	}

	public Rectangle(double newheight, double newwidth) {
		height = newheight;
		width = newwidth;
		bordertype = BorderType.SINGLE;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public BorderType getBorder() {
		return bordertype;
	}
}
