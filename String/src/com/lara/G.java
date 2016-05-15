package com.lara;

public class G {

	public static void main(String[] args) {
		
		String s1=new String("Lara");
		String s2=new String("Lara");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println(s1==s2);//This is Object class equals method this is not over-rided
		//in String class
	}

}
