package com.lara;

import java.util.ArrayList;

public class Manager2 {

	public static void main(String[] args) {
		
		ArrayList list =new ArrayList();
		list.add(67);
		list.add(true);
		int i= (Integer)list.get(0);//it returns the object at zeroth index
	/*get() is use for reading the elements of AL, it returns the object in the
	form of object ie.y we are doing explicit downcasting to avoid CCE*/
		
		boolean flag=(Boolean)list.get(1);
		
		System.out.println(i);
		System.out.println(flag);
	}

}
