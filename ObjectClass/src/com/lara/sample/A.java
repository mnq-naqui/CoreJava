package com.lara.sample;

public class A {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.toString());
		System.out.println(a1.hashCode());
		String s1= Integer.toString(a1.hashCode());
		System.out.println(s1);
		System.out.println(s1==a1.toString());
		System.out.println(s1.equals(a1.toString()));
		System.out.println(12*2==24);
	}

}
