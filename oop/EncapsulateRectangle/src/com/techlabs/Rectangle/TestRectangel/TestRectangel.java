package com.techlabs.Rectangle.TestRectangel;
import com.techlabs.Rectangle.*;
public class TestRectangel {
	
	public static void main (String args[])
	{
		Rectangle smallRectangle = new Rectangle();
		Rectangle bigRectangle = new Rectangle();
		smallRectangle.height =10;
		smallRectangle.width = 20;
		bigRectangle.height =70;
		bigRectangle.width=50;
		int area1= smallRectangle.calculateArea();
		int area2= bigRectangle.calculateArea();
		System.out.println(" smallRectangle ");
				System.out.println( "height = "+smallRectangle.height);
					System.out.println( " width="+smallRectangle.width);
							System.out.println("area="+area1 );
		System.out.println(" bigRectangle  ");
		System.out.println("height = "+bigRectangle.height);
		System.out.println("width="+bigRectangle.width);
		System.out.println("area="+area2);
		
	}

}
