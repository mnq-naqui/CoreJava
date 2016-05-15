package com.lara.rst;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("test2.txt");
		BufferedWriter bout = new BufferedWriter(out);
		bout.write("Hello to all1");
		bout.newLine();
		bout.write("Hello to all2");
		bout.newLine();
		bout.write("Hello to all");
		bout.flush();
		bout.close();
		out.close();
		System.out.println("done");

	}

}
