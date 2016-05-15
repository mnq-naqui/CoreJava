package com.lara.Program218;

class E {
	int i, j;

	E(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "i="+i+" & j="+j;
	}
	
}

public class Manager5 {

	public static void main(String[] args) {
		E e1=new E(1,2);
		E e2=new E(2,3);
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
