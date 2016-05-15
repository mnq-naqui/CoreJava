package com.lara;

import java.util.ArrayList;

public class Manager4 {

	public static void main(String[] args) {
/* We are printing output by:-
	1. list
	2. classical for loop
	3. enhanced for loop */
		ArrayList list =new ArrayList<>();
		list.add(90);
		list.add(90.45);
		list.add("asd");
		list.add(true);
		
		System.out.println(list);
		System.out.println("========================");
		for (int i = 0; i <list.size(); i++) {
			
			System.out.println(list.get(i)+",");
		}
		System.out.println();
		System.out.println("========================");
		
		for (Object object : list) {
			System.out.println(object+",");
		}
	}

}
