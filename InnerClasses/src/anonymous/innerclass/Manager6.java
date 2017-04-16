package anonymous.innerclass;

public class Manager6 {
	public static void main(String[] args) {
		B b1=new B(){

			@Override
			void test1() {
				
				System.out.println("AIC-TEST");
			}
			
		};
		b1.test1();
		b1.test2();
	}
}
