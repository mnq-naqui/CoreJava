package com.lara.equals;

class P {
	int i;

	P() {
		this.i = i;
	}
}

class Q {
	int i;

	Q() {
		this.i = i;
	}

	public boolean equals(Object o)

	{	
		if (!(o instanceof Q))
		{
			return false;
		}
		
		Q myObj = (Q) o;
		return i == myObj.i;
	}
}

public class Manager9 {

	public static void main(String[] args) {
		P obj1 = new P();
		P obj2 = new P();
		Q obj3 = new Q();
		Q obj4 = new Q();

		obj1.i = 10;
		obj2.i = 10;
		obj3.i = 10;
		obj4.i = 10;

		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));
		System.out.println(obj3.equals(obj2));

	}

}
