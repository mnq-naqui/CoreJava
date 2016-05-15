package com.lara;

public class Manager13 {

	public static void main(String[] args) {
		class A extends Thread {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
			}

		}

		class B implements Runnable {

			@Override
			public void run() {
				for (int i = 1000; i < 2000; i++) {
					System.out.println(i);
				}
			}

		}
		A a1 = new A();
		a1.start();
		B b1=new B();
		Thread t1=new Thread(b1);
		t1.start();
		for (int i = 2000; i < 3000; i++) {
			
		}
	}
}
