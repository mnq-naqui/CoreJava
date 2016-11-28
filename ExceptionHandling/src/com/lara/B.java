//Program 138 lara material return statement with try catch
package com.lara;

public class B {
	
	int test(String s1)
	{
		try {
			//some statements			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 23;
	}
	
	int test1(String s1)
	{
		try {
			//some statements	
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 23;
		}
		
	}
	/*int test2(String s1)
	{
		try {
			//some statements	
			
		} catch (Exception e) {
			// TODO: handle exception
			return 23;
		}
		
	}*/
	int test3(String s1)
	{
		try {
			//some statements	
			
		} catch (Exception e) {
			// TODO: handle exception
			return 23;
		}
		return 1;
	}
	/*int test4(String s1)
	{
		try {
			//some statements
			return 23;
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}*/
	int test5(String s1)
	{
		try {
			//some statements
			return 23;
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		return 23;
	}
/*	int test6(String s1)
	{
		try {
			//some statements
			return 23;
			
		} catch (Exception e) {
			return 0; 
		}
		return 32;//unreachable code
	}
	
*/	
}
