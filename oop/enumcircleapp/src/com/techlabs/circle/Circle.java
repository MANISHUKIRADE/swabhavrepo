package com.techlabs.circle;

public class Circle {
	private double radius;
	private ColorCategory color;

	public void setRadius(double newradius) {
		radius = newradius;
	}

	public void setColour(ColorCategory newcolor) {
		color = newcolor;
	}

	public ColorCategory getColour() {
		return color;
	}

	public double getRadius() {
		return radius;
	}

	public double calculateArea() {
		return (22 / 7) * radius * radius;

	}

}
