package com.lara.unchecked_exception_propogation;

class X {
	
	void test1(){
		System.out.println(1);
		Y y1=new Y();
		y1.test2();
		System.out.println(2);
	}
	
}
