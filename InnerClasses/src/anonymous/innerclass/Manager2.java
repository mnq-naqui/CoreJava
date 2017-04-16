package anonymous.innerclass;

public class Manager2 {
	
	public static void main(String[] args) {
		//Anonymous Implementation
		
		A a1=new A(){
			void test1(){
				System.out.println("AIC-Test1");
			}
		};
		
		a1.test1();
		a1.test2();
	}
	
}
