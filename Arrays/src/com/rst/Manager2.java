package com.rst;

import java.util.Arrays;

class B implements Comparable<Object> {
	int i;

	B(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		
		return "i =" + i;
	}

	@Override
	public int compareTo(Object obj) {
		B myObj = (B) obj;
		return i - myObj.i;

	}
}

public class Manager2 {

	public static void main(String[] args) {

		B[] x=new B[]{new B(12),new B(45),new B(23),new B(12),new B(76),new B(16)};
		
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(x));
	}

}
