//Program no 36
public class C {
	int i;
	static int j;
	class D{
		
	}
	static class E{
		
	}
	void test1()
	{
		i=10;
		j=23;
		D d1=new D();
		E e1=new E();
		test1();
		
	}
	static void test2()
	{
		//i=2;
		j=2;
		//D d1=new D();
		E e1=new E();
		//test();
		test2();
	//The way to use NSIC and NSM inside	
		C c1=new C();
		c1.i=12;
		c1.test1();
		
		D d1=c1.new D();
	}
}
