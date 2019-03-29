package com.techlabs.rectangleconstructor;

public class Rectangle {

	private double height;
	private double width;
	private BorderType bordertype;
	
	public Rectangle (double Height, double Width, BorderType border)
	{
		height=Height;
		width=Width;
		bordertype= border;
	}
	
	public Rectangle(double Height,double Width)
	{
		height = Height;
		width=Width;
	}
	public double getHeight ()
	{
		return height;
	}
	public double getWidth()
	{
		return width;
	}
	public BorderType getBorder()
	{
		return bordertype;
	}
}

