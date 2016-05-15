package com.lara;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Writing content on file
public class P {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("test.txt");
		FileWriter out=new FileWriter(f1);
		
		out.write("abc");
		out.write("hello123");
		out.write("test");
		out.flush();
		out.close();
		System.out.println("done");
		
		
	}

}
