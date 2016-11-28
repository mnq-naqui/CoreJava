package com.lara.checked_exception_propogation;

//Program 151
public class N {

	public static void main(String[] args) {
		System.out.println(3);
		W w1=new W();
		try {
			System.out.println(4);
			w1.test();
			System.out.println(5);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(6);
		}
		System.out.println(7);
		
	}

}
