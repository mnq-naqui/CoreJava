package com.lara.unchecked_exception_propogation;

class Z {
	void test3(){
		System.out.println(5);
		int i=Integer.parseInt("abc");
		System.out.println(6);
	}
}
