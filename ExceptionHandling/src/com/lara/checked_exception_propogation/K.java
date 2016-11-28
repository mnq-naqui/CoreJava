package com.lara.checked_exception_propogation;

public class K {

	public static void main(String[] args) {
		
		System.out.println(1);
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(2);
	}

}
