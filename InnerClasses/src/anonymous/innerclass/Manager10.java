package anonymous.innerclass;

public class Manager10 {
	//we are not creating object of interface or abstarct we are only using for data type purpose.
	static void method1(B b1){
		b1.test1();
		b1.test2();
	}
	
	static void method2(C c1){
		c1.test1();
		c1.test2();
	}
	
	public static void main(String[] args) {
		System.out.println("done");
	}
}
