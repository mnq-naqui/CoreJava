/**
 Program no 59 Lara Material
 */
package com.lara;

/**
 * @author Animesh Agrawal
 *
 */
public class Manager7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B b1=new B()
		{

			@Override
			void test1() {
				System.out.println("AIC-test1");
			}
			
		
			void test2() {
				System.out.println("AIC-test2");
			}

		};
		b1.test1();
		b1.test2();
		System.out.println("done");

	}

}
