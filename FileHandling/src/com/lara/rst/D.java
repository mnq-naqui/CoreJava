package com.lara.rst;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D {

	public static void main(String[] args) {
		
		File f1=new File("test1.txt");
		FileReader fin=null;
		BufferedReader bin=null;
		
		try {
			fin=new FileReader(f1);
			bin=new BufferedReader(fin);
			String s1=bin.readLine();
			while (s1!=null) {
				System.out.println(s1);
				s1=bin.readLine();
			}
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if (bin!=null) {
					bin.close();
					bin=null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (fin!=null) {
					fin.close();
					fin=null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
