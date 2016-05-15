//Program 43
public class J {
	static void test()
	{
		class B
		{
			int i=23;
		}
		B b1=new B();
		System.out.println("b1.i:"+b1.i);
		b1.i=30;
		System.out.println("b1.i:"+b1.i);
	}
	public static void main(String[] args) {
		test();
		System.out.println("Hello World");
	}
}
