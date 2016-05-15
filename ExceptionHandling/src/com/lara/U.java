/**
 * Program no 131 Lara Material
 */
package com.lara;

import java.util.Scanner;

/**
 * @author Animesh Agrawal
 *
 */
public class U {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter something");
		String s1=sc.next();
		int i=test(s1);
		System.out.println(i);
	}
	static int test(String s1)
	{
		try {
			int i=Integer.parseInt(s1);
			return i;
		} catch (NumberFormatException e) {
			return 0;
		}
		finally
		{
			return 1000;
		}
	}
}
