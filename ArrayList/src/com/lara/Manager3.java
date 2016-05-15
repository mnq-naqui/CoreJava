package com.lara;

import java.util.ArrayList;

public class Manager3 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		
		list.add(56);
		list.add("dfs");
		list.add(78.3);
		list.add(true);
		
		System.out.println(list.size());//to know the total no. of element of AL
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}

}
