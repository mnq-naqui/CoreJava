package com.lara.unchecked_exception_propogation;

//Program 144 LARA MATERIAL: Unchecked Exception Propogation.
public class H {

	public static void main(String[] args) {
		
		System.out.println(1);
		test();
		System.out.println(2);
	}
	
	static void test(){
		System.out.println(3);
		try {
			int i=13/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(4);
			e.printStackTrace();
		}
		System.out.println(5);
	}
	
	/*Here no SUO stack unwinding operation coz exception is catched at the point where it is rising*/

}
