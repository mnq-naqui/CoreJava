package anonymous.innerclass;

public class Manager12 {
	
	static void method1(B b1){
		b1.test1();
		b1.test2();
	}
	
	static void method2(C c1){
		c1.test1();
		c1.test2();
	}
	
	public static void main(String[] args) {
		
	//From null we can call any method but we will face NPE.	
		B b1= new B(){

			@Override
			void test1() {
					System.out.println("AIC-Test1");
			}
			
		};
		method1(b1);
		
		C c1=new C(){

			@Override
			public void test1() {
				System.out.println("AIC-Test1");
			}

			@Override
			public void test2() {
				System.out.println("AIC-Test1");
			}
			
		};
		method2(c1);
		
		//Another way of calling AIC
		
		method1(new B(){

			@Override
			void test1() {
				System.out.println("AIC-Test1");
			}});
		
		method2(new C(){

			@Override
			public void test1() {
				System.out.println("AIC-Test1");
				
			}

			@Override
			public void test2() {
				System.out.println("AIC-Test2");
				
			}});
	}

}
