package com.lara.own_exc_class;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(1);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if (age<=0) {
			throw new ArithmeticException();
		}
		System.out.println(2);
	}//concept continues in next program

}
