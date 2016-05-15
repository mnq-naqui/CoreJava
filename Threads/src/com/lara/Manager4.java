package com.lara;

class B extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <1000 ; i++) {

			System.out.println(i);
		}
	}	
}
public class Manager4 {

	public static void main(String[] args) {
		B b1=new B();
		b1.start();System.out.println("done");
	}

}
