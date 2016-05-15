package com.lara.rst;
class H extends Thread{

	@Override
	public void run() {
		for (int i = 0; i <3000; i++) {
			System.out.println(i);			
		}
	}
		
}
public class Manager9 {

	public static void main(String[] args) {
		H obj=new H();
		obj.setDaemon(true);
		obj.start();
		System.out.println("done");
	}

}
