/*Program 34 Lara Material
Conclusion:- 1.NSM can't be used inside static () w/o ref variable,since there is
no default this ref variable inside static().
2.Static members can be used anywhere .Static members are the universal members.
 		THESE ARE THE TWO GROUND RULES*/

public class A {
	int i;
	static int j;
	void test()
	{
		i=10;
		j=23;
		test();
		
	}
	
	static void test2()
	{
		//A a1=new A();
		//a1.i=12;
		//i=23;
		j=34;
		//a1.test();
		//test();
		test2();
	}
	
}
