package com.techlabs.cubeeven;

public class OddNumberException extends RuntimeException {
	public OddNumberException(int number){
		super("The Number "+number+"is odd");
	}
	

}
