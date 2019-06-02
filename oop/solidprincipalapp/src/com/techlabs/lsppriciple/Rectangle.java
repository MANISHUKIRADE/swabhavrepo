package com.techlabs.lsppriciple;

public class Rectangle {
	protected int height;
	protected int width;
	public Rectangle(int height ,int width) {
		// TODO Auto-generated constructor stub
		this.height=height;
		this.width=width;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public double calculateArea() {
		return height*width;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	

}
