package com.lara;

public class E {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("asdasdasdasdasdasd");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("====================");
		sb.append("asdasdasdasdasd");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("====================");
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	
	}

}
