package com.techlabs.lsppriciple;

public class TestRectSqaure {
	public static void main(String[] args) {
		should_not_change_width_if_height_changes(new Rectangle(5, 10));
		should_not_change_width_if_height_changes(new Square(4));
		
	
	}

	private static void should_not_change_width_if_height_changes(Rectangle rectangle) {
		// TODO Auto-generated method stub
		int before= rectangle.height;
		rectangle.setHeight(100);
		int after = rectangle.height;
		System.out.println(before);
		System.out.println(after);
	}

}
