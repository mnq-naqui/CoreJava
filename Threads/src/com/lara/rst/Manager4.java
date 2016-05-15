package com.lara.rst;

public class Manager4 {

	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		//t1.setName("initiator");
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		
	}

}
