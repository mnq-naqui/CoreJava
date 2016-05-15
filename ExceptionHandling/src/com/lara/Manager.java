//Program no 146 this is not in lara material, it is written in the notebook
package com.lara;

class X {
	void test1() {
		System.out.println(1);
		Y y1 = new Y();
		y1.test2();
		System.out.println(2);

	}
}

class Y {
	void test2() {
		System.out.println(3);
		try {
			Z z1 = new Z();
			z1.test3();
		} catch (NumberFormatException e) {

			System.out.println(e);
		}
		System.out.println(4);
	}
}

class Z {
	void test3() {
		System.out.println(5);
		int i=Integer.parseInt("asd");
		System.out.println(6);
	}
}

public class Manager {

	public static void main(String[] args) {
		System.out.println(7);
		X x1=new X();
		x1.test1();
		System.out.println(8);
	}

}
