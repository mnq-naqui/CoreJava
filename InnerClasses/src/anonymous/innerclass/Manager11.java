package anonymous.innerclass;

public class Manager11 {
	
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
		B b1=null;
		method1(b1);
		C c1=null;
		method2(c1);
	}

}
