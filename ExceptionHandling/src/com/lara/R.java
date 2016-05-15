//Program no 128 Lara Material
package com.lara;

import java.util.Scanner;

public class R {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Something");
		String s1 = sc.next();

		try {
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int k = 12 / (i-9);
			System.out.println(3);
		} catch (NumberFormatException e) {
			System.out.println(4);
			e.printStackTrace();
			System.out.println(5);
		}
		System.out.println(6);
	}

}
