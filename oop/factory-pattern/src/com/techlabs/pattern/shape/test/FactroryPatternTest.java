package com.techlabs.pattern.shape.test;

import com.techlabs.pattern.shape.Shape;
import com.techlabs.pattern.shape.ShapeCreator;

public class FactroryPatternTest {
	public static void main(String[] args) {
		ShapeCreator myshapecreator = new ShapeCreator();
	
		Shape shape1= myshapecreator.getShape("Rectangle");
		shape1.drawShape();
		
	}

}
