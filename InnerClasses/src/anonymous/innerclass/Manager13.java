package anonymous.innerclass;

public class Manager13 {

	public static void main(String[] args) {
		B b1=method1();
		C c1=method2();
		b1.test1();
		b1.test2();
		c1.test1();
		c1.test2();
		System.out.println("Done");
	}
	
	static B method1(){
		B b1=new B(){

			@Override
			void test1() {
				System.out.println("AIC-Test1");
			}
		};
		
		return b1;
	}
	
	static C method2(){
		return new C(){

			@Override
			public void test1() {
				System.out.println("AIC-Test1");
			}

			@Override
			public void test2() {
				System.out.println("AIC-Test2");
			}};
	}

}
