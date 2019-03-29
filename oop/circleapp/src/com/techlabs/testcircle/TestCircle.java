package com.techlabs.testcircle;
import com.techlabs.circle.*;
public class TestCircle {
	public static void main (String args[])
	{
	String colour="Green";
	double radius = 2.67;
	Circle myCircle = new Circle();
	myCircle.setColour(colour);
	myCircle.setRadius(radius);
	System.out.println("colour="+myCircle.getColour());
	System.out.println("colour="+myCircle.getRadius());
	System.out.println("area="+myCircle.calculateArea());
	}

}
