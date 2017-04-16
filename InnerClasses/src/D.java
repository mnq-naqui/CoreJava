/*Program no 37 Lara Material
Ground rule of NSIC:- 1. We can't declare or define static members inside NSIC.
2. We can use every members (SM or NSM)or outer class.

For inner class also .class file will be generated 
Outer Class $ Inner Class.class
eg D$E.class*/
public class D {
	
	class E{//NSIC
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
		
}
