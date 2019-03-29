package com.techlabs.circle;

public class Circle {
	private String colour;
	private double radius;

	public void setRadius(double r) {
		radius = r;
	}

	public void setColour(String c) {
		colour = c;
	}

	public String getColour() {
		return colour;
	}

	public double getRadius() {
		return radius;
	}

	public double calculateArea() {
		return (22 / 7) * radius * radius;

	}
}
