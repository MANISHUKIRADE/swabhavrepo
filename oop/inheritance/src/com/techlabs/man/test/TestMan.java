package com.techlabs.man.test;

import com.techlabs.man.Boy;
import com.techlabs.man.Child;
import com.techlabs.man.Man;
import com.techlabs.man.kid;

public class TestMan {
	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
		case5();

	}

	public static void case1() {
		Man x;
		x = new Man();
		x.play();
		x.read();
		x.walk();
	}

	public static void case2() {
		Boy y;
		y = new Boy();
		y.read();
		y.walk();
		y.eat();
		y.play();
		y.run();

	}

	public static void case3() {
		Man x;
		x = new Boy();
		x.read();
		x.play();
		x.walk();
		

	}

	public static void case4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new kid());
		atThePark(new Child());
	}

	public static void case5() {
		Object x;
		x = 10;
		x = "mandj";
		x = new Man();
		x = new Integer(0);

	}

	public static void atThePark(Man x) {
		System.out.println("at The Park");
		x.play();

	}

}
