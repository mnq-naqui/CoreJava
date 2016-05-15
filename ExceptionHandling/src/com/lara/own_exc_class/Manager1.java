package com.lara.own_exc_class;

import java.util.Scanner;

class AgeShouldNotBeNegative extends RuntimeException{
	
	public AgeShouldNotBeNegative(){
		
	}
	public AgeShouldNotBeNegative(String msg){
		super(msg);
	}	
	
}
public class Manager1 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(1);
		System.out.println("Enter Something");
		int age=sc.nextInt();
		
		if (age<0) {
			throw new AgeShouldNotBeNegative("Enter +ive age");
		}
	}

}
