package com.lara;

public class C {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("abc");
		StringBuffer sb1=new  StringBuffer("abc");
		
		System.out.println(sb.toString());
		System.out.println(sb1.toString());
		System.out.println(sb==sb1);
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		System.out.println(sb.equals(sb1));
	}

}
