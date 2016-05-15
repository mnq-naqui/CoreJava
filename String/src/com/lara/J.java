package com.lara;

public class J {

	public static void main(String[] args) {
		String s1="Lara";
		System.out.println(s1.hashCode());
		
		System.out.println(s1);
		s1=s1+"rst";
		System.out.println(s1);
		
		//System.out.println(s1.hashCode());String objects are immutable
		
	}

}
