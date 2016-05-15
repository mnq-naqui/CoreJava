package com.lara.Program216;

class C {
	int i;

	C(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		
		return "i="+i;
	}
}

public class Manager3 {

	public static void main(String[] args) {
		C c1 = new C(78);
		System.out.println(c1);
		C c2 = new C(34);
		System.out.println(c2);
	}

}
