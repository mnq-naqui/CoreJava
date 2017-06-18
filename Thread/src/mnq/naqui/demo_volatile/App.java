package mnq.naqui.demo_volatile;

import java.util.Scanner;

class Processor extends Thread{
	
	private volatile boolean  running=true;
	
	public void run(){
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutDown(){
		running=false;
	}
}

public class App {

	public static void main(String[] args) {
		
		Processor proc1=new Processor();
		proc1.start();
		
		System.out.println("Press enter to stop....");
		Scanner sc= new Scanner(System.in);
		sc.nextLine();
		proc1.shutDown();
		
		
	}

}
