package com.lara;

class C implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <1000 ; i++) {

			System.out.println(i);
		}
	}
	
}
public class Manager5 {

	public static void main(String[] args) {
		C c1=new C();
		Thread t1=new Thread(c1);
		t1.start();
		for (int i = 1000; i <2000 ; i++) {

			System.out.println(i);
		}
	}

}
