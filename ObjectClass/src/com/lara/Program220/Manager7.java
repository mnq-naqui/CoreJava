package com.lara.Program220;

class G {
	int i;

	G(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i=" + i;

	}
}

class H {
	G g1;
	int i;

	H(G g1, int i) {
		this.g1 = g1;
		this.i = i;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return g1 + ",i=" + i;/*
							 * Whenever u are supplying ref variable inside
							 * String object automatically it is callin toString
							 * (). Try to execute this program by without
							 * overriding toString() in class G and then
							 * overriding toString() in class G
							 */
	}
}

public class Manager7 {

	public static void main(String[] args) {
		G g = new G(45);
		H h1 = new H(g, 78);
		H h2 = new H(new G(12), 23);
		System.out.println(g);
		System.out.println(h1);
		System.out.println(h2);
	}
}
