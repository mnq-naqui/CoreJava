package com.lara.pack2;

class Shared {
	void test1() {
		Thread t1 = Thread.currentThread();
		for (int i = 0; i < 1000; i++) {
			System.out.println("test1:" + t1.getName() + ":" + i);
		}
	}
	
	void test2() {
		Thread t1 = Thread.currentThread();
		for (int i = 0; i < 1000; i++) {
			System.out.println("test2:" + t1.getName() + ":" + i);
		}
	}
	synchronized void test3() {
		Thread t1 = Thread.currentThread();
		for (int i = 0; i < 1000; i++) {
			System.out.println("test3:" + t1.getName() + ":" + i);
		}
	}
	synchronized void test4() {
		Thread t1 = Thread.currentThread();
		for (int i = 0; i < 1000; i++) {
			System.out.println("test4:" + t1.getName() + ":" + i);
		}
	}
	static void test5() {
		Thread t1 = Thread.currentThread();
		for (int i = 0; i < 1000; i++) {
			System.out.println("test5:" + t1.getName() + ":" + i);
		}
	}
	static void test6() {
		Thread t1 = Thread.currentThread();
		for (int i = 0; i < 1000; i++) {
			System.out.println("test6:" + t1.getName() + ":" + i);
		}
	}
	synchronized static void test7() {
		Thread t1 = Thread.currentThread();
		for (int i = 0; i < 1000; i++) {
			System.out.println("test7:" + t1.getName() + ":" + i);
		}
	}
	synchronized void test8() {
		Thread t1 = Thread.currentThread();
		for (int i = 0; i < 1000; i++) {
			System.out.println("test8:" + t1.getName() + ":" + i);
		}
	}
}

class Thread1 extends Thread{
	
	Shared s1;
	Thread1(Shared s1)
	{
		this.s1=s1;
	}
	@Override
	public void run() {
		s1.test8();//A
	}
}

class Thread2 extends Thread{
	
	Shared s1;
	Thread2(Shared s1)
	{
		this.s1=s1;
	}
	@Override
	public void run() {
		s1.test8();//B
	}
}
public class Manager {

	public static void main(String[] args) {
		Shared s1=new Shared();
		Shared s2=new Shared();
		
		Thread1 t1=new Thread1(s1);//C
		Thread2 t2=new Thread2(s1);//D
		t1.start();
		t2.start();
	}

}
