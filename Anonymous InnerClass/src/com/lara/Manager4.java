/**
 Program no 56 Lara Material
 */
package com.lara;

/**
 * @author Animesh Agrawal
 *
 */
public class Manager4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a1=new A()
		{
			
		};
		a1.test();
		a1.test2();
		System.out.println("------------------------");
		A a2=new A()
		{
			void test()
			{
				System.out.println("AIC-test1");
			}
			
		};
		a2.test();
		a2.test2();
		System.out.println("------------------------");
		A a3=new A()
		{
			void test2()
			{
				System.out.println("AIC-test2");
			}
			
		};
		a3.test();
		a3.test2();
		System.out.println("------------------------");
		A a4=new A()
		{	
			void test()
			{
				System.out.println("AIC-test1");
			}
			void test2()
			{
				System.out.println("AIC-test2");
			}
			
		};
		a4.test();
		a4.test2();
		
	}

}
