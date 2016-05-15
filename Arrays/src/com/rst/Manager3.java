package com.rst;

import java.util.Arrays;

class C implements Comparable<Object>{
	int i,j;

	@Override
	public String toString() {
		return "i="+i +","+"j="+j;
	}

	C(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public int compareTo(Object obj) {
		C myobj=(C)obj;
		return j-myobj.j;
	}
}

public class Manager3 {

	public static void main(String[] args) {
		
		C[]array=new C[5];
		array [0]=new C(2,3);
		array [1]=new C(2,9);
		array [2]=new C(3,6);
		array [3]=new C(5,15);
		array [4]=new C(7,34);
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
	}

}
