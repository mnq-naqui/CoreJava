/*Program no 37 Lara Material
Ground rule of NSIC:- 1. We can't declare or define static members inside NSIC.
2. We can abe to use every members (SM or NSM)or outer class.*/
public class D {
	int m;
	static int n;
	void test3()
	{
		
	}
	static void test4()
	{
		
	}
	abstract class E{//NSIC
		int i;
		//abstract void demo();
		void test1()
		{
			
		}
		/*static int j;
		
		static void test2()
		{
			
		}//See can't declare or define static methods
*/	
	}
	//See How to use all members of outer class
		D d1=new D();
		void test5(){
			d1.m=12;
			d1.test3();
			d1.test4();
		}
		
}
