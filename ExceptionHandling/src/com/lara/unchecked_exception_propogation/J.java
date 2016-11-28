package com.lara.unchecked_exception_propogation;

//Program no 146
public class J {
	public static void main(String[] args) {
		System.out.println(7);
		X x1 = new X();
		x1.test1();
		System.out.println(8);
	}
}
/*Here test3() will be removed by SUO and remaining by normal execution.*/