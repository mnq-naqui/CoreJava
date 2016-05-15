package com.lara.Program219;

class F {
	String s1;
	int i;

	F(String s1, int i) {
		this.i=i;
		this.s1=s1;
	}

	@Override
	public String toString() {
		
		return "s1="+s1+" & i="+i;
	}
}

public class Manager6 {

	public static void main(String[] args) {
		F f1=new F("",5);
		F f2=new F("qwe",9);
		F f3=new F("fds",56);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
	}

}
