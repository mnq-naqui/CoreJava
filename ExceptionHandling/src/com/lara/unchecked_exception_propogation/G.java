package com.lara.unchecked_exception_propogation;

//Program 143 LARA MATERIAL: Unchecked Exception Propogation.
public class G {

	public static void main(String[] args) {
		
		System.out.println(1);
		test();
		System.out.println(2);
	}
	
	static void test(){
		System.out.println(3);
		int i=13/0;
		System.out.println(4);
	}
	
	/*Whenever unhandled exc occurs in test(), then test() will remove forcefully by Stack Unwinding Operation.

	Whatever unhandled object is rised then that exception object will propogated to the calling() if there is no one available (try catch)to handle that object, then also that calling method remove from the stack forcefully by stack unwinding operation.

	After this unhandled exception will be propogated to the next level of the stack ie. the java cmd
	and java cmd will point message about unhandled exception.
	
	SUO stack unwinding operation will be done by java cmd internally
*/
}
