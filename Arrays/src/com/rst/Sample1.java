package com.rst;

import java.util.Arrays;
import java.util.Comparator;

class Test1 {
	int i, j;

	Test1(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "i="+i + "," +"j="+j;
	}
}

class Test2 implements Comparator<Object>{


	@Override
	public int compare(Object obj1, Object obj2) {
		
		Test1 myObj1=(Test1)obj1;
		Test1 myObj2=(Test1)obj2;
		return myObj1.i-myObj2.i;
	}
	
}

class Test3 implements Comparator<Object>{


	@Override
	public int compare(Object obj1, Object obj2) {
		
		Test1 myObj1=(Test1)obj1;
		Test1 myObj2=(Test1)obj2;
		return myObj1.j-myObj2.j;
	}
}
public class Sample1 {

	public static void main(String[] args) {
		Test1[]y=new Test1[6];
		
		y[0]=new Test1(2,5);
		y[1]=new Test1(67,34);
		y[2]=new Test1(89,25);
		y[3]=new Test1(14,35);
		y[4]=new Test1(19,24);
		y[5]=new Test1(29,45);
		
		System.out.println("Unsoretd array");
		System.out.println(Arrays.toString(y));
		Arrays.sort(y, new Test2());
		System.out.println("Sorting basis on i value");
		System.out.println(Arrays.toString(y));
		Arrays.sort(y,new Test3());
		System.out.println("Sorting basis on j value");
		System.out.println(Arrays.toString(y));
		
	}

}
