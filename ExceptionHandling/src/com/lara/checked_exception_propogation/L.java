package com.lara.checked_exception_propogation;

//Program no 149 Lara material
public class L {

	public static void main(String[] args) {
		
		System.out.println(1);
		
	}
	
	static void test(){
		
		System.out.println(3);
		
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(4);
	}

}

/*Wherever exception is occuring there itself we are handling therefore flow is normal.*/
