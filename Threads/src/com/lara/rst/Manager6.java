package com.lara.rst;

class F extends Thread{
	F(String s1){
		super(s1);
	}
}

class G implements Runnable{

	@Override
	public void run() {
		
	}
	
	
}
public class Manager6 {

	public static void main(String[] args) {
		F f1=new F("first");
		f1.start();
		G g1=new G();
		Thread t1=new Thread(g1,"second");
		t1.start();
		
		System.out.println(f1.getName());
		System.out.println(t1.getName());
	}

}
