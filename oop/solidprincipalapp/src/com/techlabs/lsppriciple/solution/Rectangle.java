package com.techlabs.lsppriciple.solution;

public class Rectangle implements Polygon {
	private int height;
	private int width;
	public Rectangle(int height, int width) {
		// TODO Auto-generated constructor stub\
		this.height=height;
		this.width=width;
		
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	 public int getHeight() {
		return height;
	}
	  public int getWidth() {
		return width;
	}


	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return height*width;
	}
	

}
