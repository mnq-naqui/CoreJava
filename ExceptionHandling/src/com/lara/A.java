//Method return statement
package com.lara;

public class A {

	int test(boolean flag)
	{
		return 1000;
	}
	
	int test1(boolean flag)
	{
		if(flag){
			return 10;
		}
		else
		{
			return 10;
		}
	}
	/*int test3(boolean flag)
	{
		if (flag) {
			return 1000;
		}
	}*/
	
	int test4(boolean flag)
	{
		if (flag) {
			return 1000;
		}
		return 10;	
	}
//	int test5 (boolean flag){
//		if(flag){
//			
//		}else{
//			return 43;
//		}
//	}
	int test6(boolean flag)
	{
		if (flag)
		{
			
		}else {
			return 21;
		}
		return 3;
	}
	/*int test7(boolean flag)
	{
		if (flag)
		{
			return 12;
		}else {
			return 21;
		}
		return 3;
	}*/

}
