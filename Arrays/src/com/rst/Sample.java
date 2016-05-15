package com.rst;

import java.util.Arrays;

class Test implements Comparable<Object> {
	int i;

	Test(int i) {
		this.i = i;
	}

	@Override
	public int compareTo(Object obj) {
		
		Test myObj=(Test)obj;	
		return myObj.i-i;
	}

	@Override
	public String toString() {
		return "i =" + i;
	}
}

public class Sample {

	public static void main(String[] args) {
		Test[] array=new Test[4];
		array[0]=new Test(12);
		array[1]=new Test(54);
		array[2]=new Test(15);
		array[3]=new Test(18);
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(array));
	}

}
