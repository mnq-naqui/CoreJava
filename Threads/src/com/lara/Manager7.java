package com.lara;
class E implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);			
		}
	}
	
}
public class Manager7 {

	public static void main(String[] args) {
		
		E e1=new E();
		Thread t1=new Thread(e1);
		t1.start();
		Thread t2=new Thread(e1);
		t2.start();
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);
		}
	}

}
