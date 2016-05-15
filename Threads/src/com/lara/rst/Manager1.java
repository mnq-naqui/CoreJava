package com.lara.rst;

class A extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);	
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class Manager1 {

	public static void main(String[] args) {
		A a1=new A();
		a1.start();
		System.out.println("done");
	}

}
