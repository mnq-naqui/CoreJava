package com.lara;

import java.io.File;
import java.io.IOException;

public class E {

	public static void main(String[] args) {
		
		File f1=new File("E:\\lab\\hello.pdf");
		try {
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
