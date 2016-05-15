package com.lara;

public class H {

	static int i = 20;
	int j = 12;
	static {
		i = 34;
		H h1 = new H();
		h1.j = 14;
	}

	public static void main(String[] args) {
		
		  int x;
		
		H h1=new H();
		h1.j=16;
		System.out.println(i);
		System.out.println(h1.j);
	}

}
