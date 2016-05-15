/** Progaram no 120 Lara Material
 * 
 */
package com.lara;

public class J {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			int i = 12 / 0;
		} catch (ArithmeticException e) {
			
			System.out.println(2);
			e.printStackTrace();
			System.out.println(3);
		}
		System.out.println(4);
	}

}
