package com.techlabs.lsppriciple.solution;

public class Square implements Polygon {
	private int side;
	public Square(int side) {
		this.side=side;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	

}
