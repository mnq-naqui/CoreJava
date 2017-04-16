package anonymous.innerclass;

public class Manager9 {

	public static void main(String[] args) {
		
		C c=new C(){

			@Override
			public void test1() {
				System.out.println("AIC-Test1");
			}

			@Override
			public void test2() {
				System.out.println("AIC-Test2");
			}
			
		};
		
		c.test1();
		c.test2();
	}

}
