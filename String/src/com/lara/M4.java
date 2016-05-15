package com.lara;

public class M4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="abc;xzy;123;poi";
		String []x=s1.split(";");
		for (String string : x) {
			System.out.println(string );
		}
	}

}
