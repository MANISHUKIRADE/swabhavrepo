package com.techlabs.basic;

public class SplitDemo {
	public static void main(String[] args) {
		String[] ar1 = args[0].split(".", 5);

		String[] ar2 = ar1[4].split(".com");
		System.out.println("company name = " + ar2[0]);

		String[] sr1 = ar2[1].split("&");

		String[] sr2 = sr1[0].split("//");

		System.out.println(sr2[1]);
		System.out.println(sr1[1]);

	}
}
