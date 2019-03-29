package com.techlabs.testrectangleconstructor;

import com.techlabs.rectangleconstructor.*;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle myrect = new Rectangle(1.3, 2.4, BorderType.DOTTED);
         Rectangle newrect= new Rectangle(1.2,3.5);
         
         
         System.out.println(myrect.getHeight());
         System.out.println(myrect.getWidth());
         System.out.println(myrect.getBorder());
         System.out.println();
         System.out.println(newrect.getHeight());
         System.out.println(newrect.getWidth());
         System.out.println(newrect.getBorder());
         
         
         
	}

}
