package com.lara;

class C {
	void test1() {
		System.out.println("C-test1");
	}
}

class D extends C {
	void test1() {
		System.out.println("D-test1");
	}
}

public class Manager {
	static void method(C c1) {
		c1.test1();
	}

	public static void main(String[] args) {
		C obj1=new C();
		D obj2=new D();
		
		method(obj1);
		method(obj2);
	
	/*While compiling first statement compiler will check that c1 is referring to class C and obj1 is also pointing
	to C object and then from method the compiler will call the test1() of class C.
	
	While executing second statement obj is the object of class D and c1 is referring to C class, while assigning
	the obj2 in c1, the c1 is referring to the class D object and hence due to the second statement now test1() of 
	class D will be executed*/
		
		
	}
}