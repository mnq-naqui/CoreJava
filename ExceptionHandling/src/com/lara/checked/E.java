package com.lara.checked;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;

//Program no 141 Lara Material
public class E {
	
	void test1(){
		System.out.println(1);
		int i=12/0;
		System.out.println(2);
		
		// Compile successfully run time exception since exception type is unchecked.
	}
	
	void test2(){
		System.out.println(1);
		try {
			int i=12/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(2);
		
		// Compile successfully run time exception since exception type is unchecked.
	}
	
	void test3(){
		System.out.println(1);
		int i=Integer.parseInt("abc");
		System.out.println(2);
		// Compile successfully run time exception since exception type is unchecked.
	}
	
	void test4(){
		System.out.println(1);
		try {
			int i=Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(2);
		// Compile successfully run time exception since exception type is unchecked.
	}
	
	void test5(){
		System.out.println(1);
		String s1=null;
		s1.length();
		System.out.println(2);
		// Compile successfully run time exception since exception type is unchecked.
	}
	
	void test6(){
		System.out.println(1);
		String s1=null;
		try {
			s1.length();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(2);
		// Compile successfully run time exception since exception type is unchecked.
	}
	
	void test7(){
		Object obj=new Object();
		E e1=(E)obj;
		// Compile successfully run time exception since exception type is unchecked.
	}
	
	void test8(){
		test8();
		// Compile successfully run time exception since exception type is unchecked.
	}
	
	void test9(){
		try {
			test9();
		} catch (StackOverflowError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Compile successfully run time exception since exception type is unchecked.
	}
	
	void test10(){

		//int x[]=new int[9999999999];
		
	}
	
	void test11(){
		try {
			
		} catch (NoClassDefFoundError e) {
			// TODO: handle exception
		}
		// Compile successfully run time exception since exception type is unchecked.
	}
	
	void test12(){
		//Class.forName("");
		
		//Throws error at compile time since it is ChecdedException. We need to provide try/catch or throws to compile successfully.
	}
	
	void test13(){
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Throws error at compile time since it is ChecdedException. We need to provide try/catch or throws to compile successfully.
	}
	
/*	void test14(){
		try {
			Class.forName("");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	/*void test15(){
		try {
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//If we are not providing the statements inside try which will produce checked exception then compiler will throw
		//error since it is aware of the statements producing the checked exceptions
	}*/
	
/*	void test16(){
	try {
		System.out.println(1);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		//We should have one statement generating checked exception
	}*/
	
	void test17(){
		try {
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Only one catch is sufficient enough to catch any number of statements producing checked exception
	}
	
	/*void test18(){
		DriverManager.getConnection("");
	}*/
	
	void test18(){
		try {
			DriverManager.getConnection("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*void test19(){
		try {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	/*void test20(){
		try {
			Class.forName("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2 CTE 
	}*/
	
	void test21(){
		try {
			Class.forName("");
			DriverManager.getConnection("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*void test22() {
		new FileWriter("");
	}*/
	
	void test23() {
		try {
			new FileWriter("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*void test24() {
		try {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	/*void test25() {
		clone();
	}*/
	
	void test26() {
		try {
			clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*void test27() {
		try {
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	/*void test28() {
		Thread.sleep(12122);
	}*/
	
	void test29() {
		try {
			Thread.sleep(121212);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*void test30() {
		try {
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	/*void test31(){
	
		DateFormat df=DateFormat.getInstance();
		df.parse("");
	}*/
	
	void test32(){
		
		DateFormat df=DateFormat.getInstance();
		try {
			df.parse("");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
/*void test33(){
		
		DateFormat df=DateFormat.getInstance();
		try {
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
