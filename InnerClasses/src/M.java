
public class M {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		class A
		{
			void test()
			{
				System.out.println("111111");
				System.out.println("111111");
				System.out.println("111111");
			}
		}
		A a1=new A();
		a1.test();
		System.out.println("======================");
		a1.test();
		System.out.println("=======================");
	}

}
