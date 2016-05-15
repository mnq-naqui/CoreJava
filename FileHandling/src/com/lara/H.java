package com.lara;

import java.io.File;

public class H {

	public static void main(String[] args) {
		
		File f1=new File("D:/hello");//we can make dir in another destination also
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	}

}
