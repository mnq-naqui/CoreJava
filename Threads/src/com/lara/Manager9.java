package com.lara;
class G extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			
		}
	}
	void startThread(){
		start();
	}
}
public class Manager9 {

	public static void main(String[] args) {
		G g1=new G();
		g1.startThread();
		for (int i = 1000; i < 2000; i++) {
			
			System.out.println(i);
			
		}
	}

}
