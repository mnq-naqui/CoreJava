/**
 Program no 54 Lara Material
 */
package com.lara;

/**
 * @author Animesh Agrawal
 *
 */
public class Manager2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a1=new A()
		{
			void test()
			{
				System.out.println("AIC-test1");
			}/*
			Designing a class w/o a name by making subclass to A
			LHS-is a1 ref var(superclass type)
			RHS-is a subclass to A,RHS is autocasted
			 AIC */
		};
		a1.test();
		a1.test2();
		System.out.println("done");
	} /*Even though we are not using extends keyword here we Anonymous class will  inherit the members of class A
	and test2() will be inheriting and test() will be over-rided method.Here AIC is sub class to A
	Usage:-
	====== 1.We are modifying the behaviour of test() only for one object only.
	 	   2.Though Inner class doesn't have any name, we can't refer that class again
	 	   3. If we need modification for only one object then we should use AIC*/

}
