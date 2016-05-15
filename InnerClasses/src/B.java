//Program no 35
public class B {
	class C {}//NSIC
	static class D{}//SIC
	void test1()
	{
		C c1=new C();
		D d1=new D();
	}
	static void test2()
	{	B b1=null;
		C c1=b1.new C();//MNQ This is the way u can use NSIC
		
		// C c1=new C();
		D d1=new D();
	}
}
