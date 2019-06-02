package com.techlab.cal;

public class Calculator {
	public double caculate_cube_of_EvenNo(int n) {
		if(n%2==0) {
			return n*n*n;
		}
		else {
			throw new OddNumberException(n) ;
		}
	}
	
	public double rounup(double d){
		d=d*10;
		d=(int)d/10;
		return d;
	}
	

}
