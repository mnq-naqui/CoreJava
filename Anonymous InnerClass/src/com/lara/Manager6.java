/**
 Program no 58 Lara Material Here we are accessing Abstract class through Inner class
 */
package com.lara;

/**
 * @author Animesh Agrawal
 *
 */
public class Manager6 {

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
/*			We are not creating object to B.We are developing AIC by making sub class to B
 * 			AIC shd be always concrete wherever class is defining itself*/
		};
		b1.test1();
		b1.test2();
		System.out.println("done");
	}

}
