/**
 Program no 61 Lara Material
 */
package com.lara;

/**
 * @author Animesh Agrawal
 *
 */
public class Manger9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		C c1=new C()
				{

					@Override
					public void test1() {
						System.out.println("AIC-test1");
					}

					@Override
					public void test2() {
						System.out.println("AIC-test2");						
					}
			
				};
				c1.test1();
				c1.test2();
	}

}
