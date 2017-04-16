package anonymous.innerclass;

public class Manager3 {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A(){
			void test2(){
				System.out.println("AIC-Test2");
			}
		};
		
		a1.test1();
		a1.test2();
		a2.test1();
		a2.test2();
		System.out.println("done");
	}

}
