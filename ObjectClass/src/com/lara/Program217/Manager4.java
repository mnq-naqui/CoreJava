package com.lara.Program217;

class D {
	int i;

	D(int i) {
		this.i = i;
	}

}

public class Manager4 {

	public static void main(String[] args) {
		D d1 = new D(14);
		D d2 = new D(14);
		D d3=d2;
		D d4=d1;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}

}
