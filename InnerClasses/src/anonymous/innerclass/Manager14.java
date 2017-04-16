package anonymous.innerclass;

public class Manager14 {

	public static void main(String[] args) {
		Fan f1=new Fan();
		Switch s1=f1.getSwitch();
		s1.on();
		System.out.println(f1.getRunningStatus());
		s1.off();
		System.out.println(f1.getRunningStatus());
	}

}
