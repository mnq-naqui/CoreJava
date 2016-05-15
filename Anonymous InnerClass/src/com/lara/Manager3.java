/**
 Program no 55 Lara Material
 */
package com.lara;

/**
 * @author Animesh Agrawal
 *
 */
public class Manager3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A()
		{
			void test2()
			{
				System.out.println("AIC-test2");
			}
		};
		a1.test();
		a2.test2();
		a1.test();
		a2.test2();
		System.out.println("done");
	}

}
