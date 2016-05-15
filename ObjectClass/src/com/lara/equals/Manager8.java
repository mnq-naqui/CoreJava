//Pg no 233
package com.lara.equals;

class L {
	int i;
}

class M {
	int i;

	@Override
	public boolean equals(Object obj) {
		
		/*if (!(obj instanceof M)) {
			return false;
		}*/
		M myObj = (M) obj;
		return (i == myObj.i);
	}
}

public class Manager8 {

	public static void main(String[] args) {
		L obj1 = new L();
		L obj2 = new L();
		M obj3 = new M();
		M obj4 = new M();
		
		System.out.println(obj1.equals(obj2));
		System.out.println("----------------");
		System.out.println(obj3.equals(obj4));
		System.out.println("----------------");
		System.out.println(obj3.equals(obj1));
		System.out.println("-----------------");
		System.out.println(obj3.equals(obj1));
		

	}

}
