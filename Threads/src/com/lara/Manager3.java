package com.lara;

class ThreadA extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {

			System.out.println(i);
		}
	}
}	
	class ThreadB extends Thread{

		@Override
		public void run() {
			for (int i = 1000; i <2000 ; i++) {

				System.out.println(i);
			}
		}	
	
}
public class Manager3 {

	public static void main(String[] args) {
		
		ThreadA t1=new ThreadA();
		t1.start();
		
		ThreadB t2=new ThreadB();
		t2.start();
		
		for (int i = 2000; i <3000 ; i++) {

			System.out.println(i);
		}
	}

}
