package com.lara.rst;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class B {

	public static void main(String[] args) throws IOException {

		FileReader in = new FileReader("test.txt");
		BufferedReader bin = new BufferedReader(in);

		String s1 = bin.readLine();
		while (s1 != null) {
			System.out.println(s1);
			s1 = bin.readLine();
		}
		bin.close();
		in.close();
		System.out.println("done");
	}
}
