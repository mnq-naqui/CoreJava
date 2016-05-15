package com.lara.own_exc_class;

import java.util.Scanner;

class AgeIsNegativeException extends ArithmeticException{
	
	public AgeIsNegativeException()
	{
		
	}
	
	public AgeIsNegativeException(String msg)
	{
		super(msg);
	}
	
}
public class I {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(1);
		System.out.println("Enter age");
		int age=sc.nextInt();
		if (age<=0) {
			throw new AgeIsNegativeException("Age should not be -ive");
			
		}
		System.out.println(2);
	}

}
