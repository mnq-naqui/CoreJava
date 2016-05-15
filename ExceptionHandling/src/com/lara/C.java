//Program 139 Lara Material 
package com.lara;

public class C {
	int test1() {
		try {

		} catch (NullPointerException e) {

		} catch (ArithmeticException ex) {

		}
		return 12;
	}

	int test2() {
		try {
			// some statements
			return 12;
		} catch (NullPointerException e) {
			return 23;
		} catch (ArithmeticException ex) {
			return 12;
		}
	}
	/*int test3() {
		try {
			// some statements
			
		} catch (NullPointerException e) {
			return 23;
		} catch (ArithmeticException ex) {
			return 12;
		}
	}*/
	
	int test4() {
		try {
			// some statements
			
		} catch (NullPointerException e) {
			return 23;
		} catch (ArithmeticException ex) {
			return 12;
		}
		return 34;
	}
	/*int test5() {
		try {
			// some statements
			
		} catch (NullPointerException e) {
		
		} catch (ArithmeticException ex) {
			return 12;
		}
	}
*/
	int test6() {
		try {
			// some statements
			
		} catch (NullPointerException e) {
			
		} catch (ArithmeticException ex) {
			return 12;
		}
		return 34;
	}
	/*int test7() {
		try {
			// some statements
			return 14;
			
		} catch (NullPointerException e) {
			return 23;
		} catch (ArithmeticException ex) {
			return 12;
		}
		return 34;
	}*/

}
