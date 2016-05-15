package com.lara;

class I extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}

}

public class Manager11 {

	public static void main(String[] args) {
		I obj = new I();
		obj.run();
		obj.start();
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);

		}
	}

}
