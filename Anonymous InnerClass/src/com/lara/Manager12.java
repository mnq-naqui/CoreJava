/**
 Program no 64 Lara Material Very logical Observe
 */
package com.lara;

/**
 * @author Animesh Agrawal
 * 
 */
public class Manager12 {

	static void method1(B b1) {
		b1.test1();
		b1.test2();
	}

	static void method2(C c1) {
		c1.test1();
		c1.test2();
	}

	public static void main(String[] args) {
		B b1 = new B() {

			@Override
			void test1() {
				System.out.println("AIC-Test1");
			}

		};
		method1(b1);
		C c1 = new C() {

			@Override
			public void test1() {
				System.out.println("AIC-test1");
			}

			@Override
			public void test2() {
				System.out.println("AIC-test");
			}

		};
		method2(c1);
		System.out.println("=================================");
		/*While calling method1 we are supposed to supply ref var of obj of B.Here we are 
		 * supplying obj of subclass to B auto sub class is autocasted to B type */
		method1(new B(){
			void test1()
			{
				System.out.println("AIC-test1");
			}
		});
		method2(new C(){

			@Override
			public void test1() {
				System.out.println("AIC-test1");
			}

			@Override
			public void test2() {
				System.out.println("AIC-test2");
			}
			
		});

	}

}
