package com.lara;

import java.io.File;
import java.io.IOException;

public class M {

	public static void main(String[] args) throws IOException {
		
		System.out.println(1);
		File f1=new File("D:/lab","abc.txt");
		File f2=new File("D:/lab","test");
		
		//First const taking location and second const taking either file name or dir
		
		System.out.println(f1.createNewFile());
		System.out.println(f2.mkdir());
		
	}

}
