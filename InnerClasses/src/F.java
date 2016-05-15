//Program no 39 Lara Material
//All siz rules
public class F {
	int i;
	static int j;
	void test1()
	{
		i=1;
		j=2;
		test1();
		test2();
		G g1=new G();
		H h1=new H();
	
	}
	static void test2()
	{
		//i=1;
		j=2;
		//test1();
		test2();
		//G g1=mew G();
		H h1=new H();
	}
	class G
	{
		int m;
		//static int n;
		void test3()
		{
			i=10;
			j=23;
			test1();
			test2();
			G g1=new G();
			H h1=new H();
			m=21;
			//n=89;
		}
		/*static void test4()
		{
			i=56;
			j=53;
			test1();
			test2();
			G g1=new G();
			H h1=new H();
			m=21;
			n=23;
		}*/
	}
	static class H
	{
		int p;
		static int q;
		void test5()
		{
			//i=2;
			j=2;
			//test1();
			test2();
			p=21;
			q=43;
			//G g1=new G ();
			H h1=new H();
			
		}
		static void test6()
		{
			//i=56;
			j=53;
			//test1();
			test2();
			//p=2;
			q=87;
			//G g1=new G();
			H h1=new H();
		
		}
	}
}
