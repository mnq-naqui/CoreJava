package com.lara;
/*
1. Without method overriding we can't achieve polymorphism.
2. We can't use static members to achieve poly,since static members are not
	inherited to the sub-class.*/
class E {
	static void test1() {
		System.out.println("C-test1");
	}
}

class F extends E {
	static  void test1() {
		System.out.println("D-test1");
	}
}

public class Manager1 {
	static void method(E e1) {
		e1.test1();
	}

	public static void main(String[] args) {
		E obj1=new E();
		F obj2=new F();
		
		method(obj1);
		method(obj2);
	
	}
}