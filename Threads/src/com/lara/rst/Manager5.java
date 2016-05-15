package com.lara.rst;

class E extends Thread{
	
} 
public class Manager5 {

	public static void main(String[] args) {
		E e1=new E();
		e1.setName("first THread");
		e1.start();
		
		E e2=new E();
		e2.setName("second THread");
		e2.start();
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getPriority());
		System.out.println(e1.isDaemon());
		
		System.out.println("====================");
		
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		System.out.println(e2.getPriority());
		System.out.println(e2.isDaemon());
	}

}
