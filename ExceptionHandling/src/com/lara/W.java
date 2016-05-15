//Program 133 Lara material
package com.lara;

public class W {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(true){
			return;
		}
		try {
			System.out.println(1);

			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
System.out.println(2);		}
		finally{
			System.out.println(3);
		}
		System.out.println(4);
	}
/*Blank o/p cz control is not entering into the try block, hence finally is not executed
 *There are only two scenario which stops the execution of finally:-
 *1. If control does not enters into the try block.
 *2.By using system .exit() */
}
