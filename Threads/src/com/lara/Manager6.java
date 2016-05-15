package com.lara;

class D extends Thread{
	public void run() {

		for (int i = 0; i <1000 ; i++) {

			System.out.println(i);
		}
	}
} 
public class Manager6 {

	public static void main(String[] args) {
		
		D d1=new D();
		d1.start();
		
		D d2=new D();
		d2.start();
		
		for (int i = 1000; i<2000 ; i++) {

			System.out.println(i);
		}
	}

}
