package com.lara;

import java.io.FileWriter;
import java.io.IOException;

public class R {

	public static void main(String[] args) throws IOException {
		
		FileWriter out=new FileWriter("test.txt");
		
		out.write("2");
		out.write("\n");
		out.write("hello to all");
		out.write("\nhello to all");
		out.flush();
		out.close();System.out.println("done");
	}

}
