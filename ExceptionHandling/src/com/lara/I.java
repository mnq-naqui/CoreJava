//Program no 145 Lara Material
package com.lara;

public class I {

	
	public static void main(String[] args) {
		System.out.println(1);
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(2);
	}
	static void test()
	{
		System.out.println(3);
		int i=12/0;
		System.out.println(4);
	}
}
