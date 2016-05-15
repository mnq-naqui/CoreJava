package com.lara.equals;

class F {
	int i, j;

	F(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public boolean equals(Object obj) {
		F myObj = (F) obj;
		boolean flag = (i == myObj.i);
		return flag;
	}
}

public class Manager5 {

	
	public static void main(String[] args) {
		F f1=new F(2,3);
		F f2=new F(2,6);
		F f3=new F(6,7);
		
		System.out.println(f1.equals(f2));
		System.out.println(f1==f2);
		System.out.println(f2.equals(f3));
		System.out.println(f3.equals(f1));
	}

}
