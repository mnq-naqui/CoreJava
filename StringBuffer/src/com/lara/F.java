package com.lara;

public class F {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("abc");
		sb.append("xyz");
		sb.append("asd");
		
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
