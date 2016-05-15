package com.lara.rst;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C {

	public static void main(String[] args) {
		
		FileWriter out=null;
		BufferedWriter bout=null;
		
		try {
			out=new FileWriter("test1.txt");
			bout=new BufferedWriter(out);
			bout.write("Hello to all1");
			bout.newLine();
			bout.write("Hello to all2");
			bout.newLine();
			bout.write("Hello to all");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if (bout!=null) {
					bout.flush();
					bout.close();
					bout=null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				if (out!=null) {
					out.close();
					out=null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("done");
	}

}
