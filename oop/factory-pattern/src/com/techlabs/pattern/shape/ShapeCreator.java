package com.techlabs.pattern.shape;

public class ShapeCreator {
	

	public Shape getShape(String shapename) {
		// TODO Auto-generated constructor stub
		if(shapename.equalsIgnoreCase("circle")) {
			return new Circle();		
			}
		else if(shapename.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		else if(shapename.equalsIgnoreCase("square")) {
			return new Square();
		}

		else {
			return null;
		}
	}

}
