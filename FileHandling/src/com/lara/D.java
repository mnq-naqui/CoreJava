package com.lara;

import java.io.File;
import java.io.IOException;

public class D {

	public static void main(String[] args) {
		
		File f2=new File("D:/laratest.html");//We can create file in any drive
		try {
			System.out.println(f2.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
