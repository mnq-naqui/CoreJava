//Program no 225
package com.lara.equals;
class A{
	int i;
}
public class Manager {

	public static void main(String[] args) {
		A a1=new A();
		a1.i=12;
		A a2=new A(); 
		a2.i=12;
		A a3=a1;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a1==a3);
	}

}
