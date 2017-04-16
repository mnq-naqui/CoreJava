package anonymous.innerclass;

public class Manager7 {
	
	public static void main(String[] args) {
		B b=new B(){

			void test1() {
				System.out.println("AIC-Test1");
			}
			
			void test2() {
				System.out.println("AIC-Test2");
			}
			
		};
		
		b.test1();
		b.test2();
		
	}
}
