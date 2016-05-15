package com.lara.rst;

class I extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);			
		}
		System.out.println("child end");
	}
	
}
public class Manager10 {

	public static void main(String[] args) {
		
		I obj=new I();
		obj.start();
		
		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);			
		}
	}

}
