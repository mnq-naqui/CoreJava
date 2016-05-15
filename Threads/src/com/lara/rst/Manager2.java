package com.lara.rst;
class B implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);			
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
}
public class Manager2 {

	public static void main(String[] args) {
		
		B b1=new B();
		Thread t1=new Thread(b1);
		t1.start();
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
