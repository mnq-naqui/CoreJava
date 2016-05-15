/*Program no 125 Lara Material.abstract.If at all exception is occuring before
try and catch then catch is not responsible for handling the exception.*/ 

package com.lara;

public class O {

	
	public static void main(String[] args) {
		System.out.println(1);
		int i=12/0;
		try {
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println(3);
		}
		System.out.println(4);
	}

}
