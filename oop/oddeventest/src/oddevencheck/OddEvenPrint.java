package oddevencheck;

import oddeventest.OddEven;

public class OddEvenPrint {
	public static void main(String[] args) {

		OddEven checkoddevenobject = new OddEven();
		System.out.println("Even no");
		for (int number = 1; number <= 100; number++) {
			if (checkoddevenobject.checkEven(number) == true) {
				System.out.println(number);

			}

		}
		System.out.println("odd no");

		for (int number = 1; number <= 100; number++) {
			if (checkoddevenobject.checkEven(number) == false) {
				System.out.println(number);

			}

		}
	}
}
