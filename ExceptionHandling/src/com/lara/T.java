//Program no 130 Lara Material
package com.lara;

import java.util.Scanner;

public class T {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Something");
		String s1=sc.next();
		try {
			System.out.println(1);
			int i=Integer.parseInt(s1);
			System.out.println(2);
			int k=i/(i-9);
			System.out.println(3);
			
		} catch(ArithmeticException ex){
			
			System.out.println(4);
			ex.printStackTrace();
			System.out.println(5);
		}
		catch (NumberFormatException e) {
			
			System.out.println(6);
			e.printStackTrace();
			System.out.println(7);
		}
		System.out.println(8);
	}

}
