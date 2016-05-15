package com.lara.own_exc_class;

public class D {

	public static void main(String[] args) {
		System.out.println(1);
		if (true) {
			throw new NumberFormatException("some messsage");
		}
		System.out.println(2);
	}
}
