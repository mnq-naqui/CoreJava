//Program 229
package com.lara.equals;
class E{
	int i;
	E(int i){
		this.i=i;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this==obj;
	}
}
public class Manager4 {

	
	public static void main(String[] args) {
		E e1=new E(96);
		E e2=new E(96);
		E e3=e2;
		
		System.out.println(e1.equals(e2));
		System.out.println(e2==e3);
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e1));
	}

}
