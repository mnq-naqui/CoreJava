package com.lara.Program222;

class K {
	int i;

	K(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		String s1 = super.toString();
		String s2 = "i=" + i;

		return s1+ " & "+ s2;
	}
}

public class Manager9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		K k1 = new K(12);
		System.out.println(k1);

		K k2 = new K(78);
		System.out.println(k2);
	}

}
