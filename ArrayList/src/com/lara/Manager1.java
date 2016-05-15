package com.lara;

import java.util.ArrayList;/*
1.Array list is internally managing index. Automatically elements
are adding in thelist in order we are providing.
2.In AL toString() is over-rided, add() of AL takess arguement as object type.*/
public class Manager1 {

	public static void main(String[] args) {
		
		ArrayList list =new ArrayList<>();
		list.add(90);
		list.add(90.45);
		list.add("asd");
		list.add(true);
		
		System.out.println(list);
	}

}
