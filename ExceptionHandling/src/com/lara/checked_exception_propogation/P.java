package com.lara.checked_exception_propogation;

//Program no 153
public class P {
	
static void test() throws ClassNotFoundException{
		
	}
public static void main(String[] args) {
		
		try {
			test();
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
	}
/*Here the program will execute successfully coz compiler will see that test() throws Class Not Found Exception if we
throw any exception from the called() then it is necessary to keep try catch in caller.
Notice Class O also to get the difference
*/
	
}

