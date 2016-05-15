package com.lara;

import java.io.File;
import java.io.IOException;

public class J {

	public static void main(String[] args) {
		
		File f1=new File("abc");
		File f2=new File(f1,"hello.txt");//f1 is acting like directory
		
		try {
			System.out.println(f2.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
