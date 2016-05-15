package com.lara.equals;
class B{
	int i;
}
public class Manager1 {

	public static void main(String[] args) {
		
		B b1=new B();
		B b2=new B();
		
		B b3=b1;
		b1.i=b2.i=21;
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		System.out.println(b2==b3);
		System.out.println(b3==b1);
		System.out.println(b1.i==b2.i);
		
		int i=9;
		int j=9;
		
		System.out.println(i==j);
			}

}
