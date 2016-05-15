package com.lara.rst;

public class Manager8 {

	public static void main(String[] args) {
		class A extends Thread{
			
		}
		A a1=new A();
		System.out.println(a1.getPriority());
		Thread t1=Thread.currentThread();
		t1.setPriority(Thread.MAX_PRIORITY);
		A a2=new A();
		System.out.println(a2.getPriority());
	}

}
