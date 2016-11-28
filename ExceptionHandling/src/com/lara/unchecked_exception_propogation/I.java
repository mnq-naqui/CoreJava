package com.lara.unchecked_exception_propogation;

public class I {

//Program 145 LARA MATERIAL: Unchecked Exception Propogation.
public static void main(String[] args) {
		
		System.out.println(1);
		try {
			test();
		} catch (ArithmeticException e) {
			System.out.println("exception");
		}
		System.out.println(2);
	}
	
	static void test(){
		System.out.println(3);
		int i=39/0;
		System.out.println(4);
	}
	
	/*Here one time SUO occurs at exception statement and test method removes forcefully by SUO . After that exception 
	 * object is propogated to the caller of methodsince try and catch is available that will handled the rised exception 
	 * object  */

}
