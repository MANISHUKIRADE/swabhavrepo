package com.techlabs.lsppriciple.solutiontest;

import com.techlabs.lsppriciple.Rectangle;

public class TestLspPrinciple {
	public static void main(String[] args) {
		
	
	Rectangle rect1 = new Rectangle(10, 20);
	}
	
	
	private static void should_not_change_width_if_height_changes(Rectangle rectangle) {
		// TODO Auto-generated method stub
		int before= rectangle.getHeight();
		rectangle.setHeight(100);
		int after = rectangle.getWidth();
		System.out.println(before);
		System.out.println(after);
	}

}
