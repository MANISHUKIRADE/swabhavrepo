package com.techlabs.pattern.singleton;

import java.awt.Rectangle;

public class Recangle {
	private static Recangle insatnce = new Recangle();
	private  Recangle() {
		
	}
	public static Recangle getinstance () {
		return insatnce;
	}
	public void Message() { 
		System.out.println("i am recangel");
	}
	
	
	

}
