package com.lara.own_exc_class;

import java.util.Scanner;

class BalanceShouldBePositive extends Throwable{
	public BalanceShouldBePositive()
	{
		
	}
	public BalanceShouldBePositive(String msg )
	{
		super(msg);
	}
}
public class Manger {

	/**
	 * @param args
	 * @throws BalanceShouldBePositive
	 */
	public static void main(String[] args) throws BalanceShouldBePositive{
		Scanner sc=new Scanner(System.in);
		System.out.println(1);
		System.out.println("Enter Something");
		int balance=sc.nextInt();
		
		if (balance<0) {
			 throw new BalanceShouldBePositive("Bal shd be +ive");
		}
		

	}

}
