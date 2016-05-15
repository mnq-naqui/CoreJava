package com.lara.Program223;

class L {
	int i;

	L(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i=" + i;
	}

}

class M extends L {
	int j;

	M(int i, int j) {
		super(i);
		this.j = j;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ",j=" + j;
	}

}

public class Manager10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		L obj=new L(45);
		M obj1=new M(2,45);
		
		System.out.println(obj);
		System.out.println(obj1);
	}

}
