package com.lara.checked_exception_propogation;

class W {
	void test() throws ClassNotFoundException {
		System.out.println(1);
		Class.forName("");
		System.out.println(2);
	}
}
