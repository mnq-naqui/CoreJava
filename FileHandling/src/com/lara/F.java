package com.lara;

import java.io.File;
import java.io.IOException;

public class F {

	public static void main(String[] args) {
		
		File f1=new File("Z:/hello.txt");//If path specified doesn't exist u get IOExc
		
		try {
			System.out.println(1);
			System.out.println(f1.createNewFile());
			System.out.println(2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
