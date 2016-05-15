/**
 Program no 63 Lara Material
 */
package com.lara;

/**
 * @author Animesh Agrawal
 *
 */
public class Manager11 {

	/**
	 * @param args
	 */static void method1(B b1)
		{
			b1.test1();
			b1.test2();
		}
	 static void method2(C c1)
		{
			c1.test1();
			c1.test2();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=null;
		method1(b1);
		C c1=null;
		method2(c1);
		System.out.println("done");
/*		We get null pointer exc here coz syntacticallt everything is correct*/
	}

}
