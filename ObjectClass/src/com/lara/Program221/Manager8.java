package com.lara.Program221;

class I {
	int x;

	I(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
 		return " x="+x;
	}
}

public class Manager8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		I obj=new I(45);
		String s1="hello"+obj;
		System.out.println(s1);
	}

}
