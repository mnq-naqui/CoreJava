/*Program no 38 Lara Material
Ground rule of SIC:- 1. We can declare or define all members(SM or NSM) inside SIC.
2. We can not use NSM of outer class.*/
public class E {
	int i;
	static int j;
	void test1()
	{
		
	}
	static void test2()
	{
		
	}
	static  class F{//SIC
		int i;
		static int j;
	
		void test3()
		{

			E.j=34;
			i=23;
		}
		static void test4()
		{
			E.j=34;
			E e1=new E();
			e1.i=67;
			//E.i=23;
		}
		
	}
	
}
