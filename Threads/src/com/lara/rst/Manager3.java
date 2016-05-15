package com.lara.rst;
class Util{
	static void sleep(long millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class C extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
			Util.sleep(1000);
		}
	}
	
}
class D implements Runnable{

	@Override
	public void run() {
		for (int i = 20; i < 40; i++) {
			System.out.println(i);
			Util.sleep(1000);
		}
		
	}
	
}
public class Manager3 {

	public static void main(String[] args) {
		
		C c1=new C();
		c1.start();
		D d1=new D();
		Thread t1=new Thread(d1);
		
		for (int i = 40; i < 60; i++) {
			System.out.println(i);
			Util.sleep(1000);
		}
	}

}
