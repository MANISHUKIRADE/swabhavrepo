package com.techlabs.testrectangleconstructor;

import com.techlabs.rectangleconstructor.*;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(1.3, 2.4, BorderType.DOTTED);
         Rectangle rect2= new Rectangle(1.2,3.5);
         
         
         System.out.println(rect1.getHeight());
         System.out.println(rect1.getWidth());
         System.out.println(rect1.getBorder());
         System.out.println();
         System.out.println(rect2.getHeight());
         System.out.println(rect2.getWidth());
         System.out.println(rect2.getBorder());
         
         
         
	}

}
