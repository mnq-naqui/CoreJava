package com.lara;
class F extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			start();
			
		}
	}
	
}
public class Manger8 {

	public static void main(String[] args) {
		
		F f1=new F();
		f1.start();
		for (int i =1000; i < 2000; i++) {
			
			System.out.println(i);
						
		}
	}

}
