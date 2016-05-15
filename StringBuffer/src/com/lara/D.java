package com.lara;

public class D {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("abcabcabcabcabc");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
