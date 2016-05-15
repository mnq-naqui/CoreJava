package com.lara;

import java.io.File;

public class I {

	public static void main(String[] args) {
		File f1=new File("D:/abc/hello/test");//If abc and hello both are avail then only it creates the file
		System.out.println(f1.mkdir());
		System.out.println("done");
	}

}
