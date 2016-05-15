package com.lara.rst;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E {

	public static void main(String[] args) {
		
		File f1=new File("C:\\Users\\PC\\Pictures\\naruto.jpg.jpg");
		File f2=new File("test.jpg");
		FileInputStream fin=null;
		FileOutputStream fout=null;
		BufferedInputStream bin=null;
		BufferedOutputStream bout=null;
		
		try {
			fin=new FileInputStream(f1);
			bin=new BufferedInputStream(fin);
			byte[] b=new byte[(int)f1.length()];
			fin.read();
			
			fout=new FileOutputStream(f2);
			bout=new BufferedOutputStream(fout);
			bout.write(b);
			System.out.println("done");
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
				if (fout!=null) {
					fout.close();
					fout=null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
