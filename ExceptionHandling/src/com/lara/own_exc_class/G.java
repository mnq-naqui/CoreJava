package com.lara.own_exc_class;

public class G {
	public static void main(String[] args)throws ClassNotFoundException {
		System.out.println(1);
		if (true) {
			throw new ClassNotFoundException("some message");			
		}
	}
}
	