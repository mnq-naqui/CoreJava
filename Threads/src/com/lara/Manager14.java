package com.lara;

public class Manager14 {

	public static void main(String[] args) {
		
		Thread t1=new Thread(){

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);					
				}
			}
			
		};
		t1.start();
		
		Runnable r1=new Runnable(){

			@Override
			public void run() {
				for (int i = 1000; i < 2000; i++) {
					System.out.println(i);					
				}
			}
			
		};
			Thread t2=new Thread(r1);
			t2.start();
			for (int i = 2000; i < 3000; i++) {
				System.out.println(i);
			}
	}

}
