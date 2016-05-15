package com.lara;

import java.util.ArrayList;

public class Manager5 {

	public static void main(String[] args) {
		ArrayList list =new ArrayList<>();
		list.add(90);
		list.add(90.45);
		list.add("asd");
		list.add(true);
		
		System.out.println(list);
		
		list.add("xyz");
		System.out.println(list);
		
		list.add(2,"check");
		
		System.out.println(list);
		
	}

}
