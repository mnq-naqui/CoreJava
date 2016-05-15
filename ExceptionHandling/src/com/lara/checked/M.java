//Progarm no 150 lara material
package com.lara.checked;

public class M {

	
	public static void main(String[] args) {
		System.out.println(1);
		
		//test();
	try {
		test();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
		System.out.println(2);
		

	}
	
	static void test() throws ClassNotFoundException
	{
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}

}
