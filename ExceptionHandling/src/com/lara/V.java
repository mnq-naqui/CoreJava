/**
 * Program no 132 of Lara Material
 */
package com.lara;


public class V {


	public static void main(String[] args) {
		try {
			System.out.println(1);
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println(3);
		}
		System.out.println(4);
	}

}
