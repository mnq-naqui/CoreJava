package mnq.naqui;

//First way of creating the thread by extending Thread class
class Runner extends Thread{
	
	@Override
	public void run(){
		for (int i=0; i<10; i++){
			System.out.println("Hello "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class Manager {
	public static void main(String[] args) {
		Runner r1=new Runner();
		Runner r2=new Runner();
		r1.start();
		r2.start();
		//r1.run();
		//r2.run();
	}
}
