package com.lara;

class H extends Thread{
	H(){
		start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);			
		}
	}
}
public class Manager10 {

	public static void main(String[] args) {
		H h1=new H();
		h1.start();
		for (int i = 1000; i<2000; i++) {
			System.out.println(i);			
		}

	}

}
