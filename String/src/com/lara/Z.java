package com.lara;

public class Z {

	public static void main(String[] args) {
		String s1=" abc 123 ";
		String s2="    aa as as    ";
		String s3="    a";
		s3=s3.trim();
		s2=s2.trim();
		s1=s1.trim();//Cut leading and tailing whitespacesnhence get 7 as output
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
	}

}
