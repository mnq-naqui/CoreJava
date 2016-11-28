package com.lara.checked_exception_propogation;

//Program 151
public class M {

	public static void main(String[] args){
		
		System.out.println(1);
		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(2);
	}
	
	static void test() throws ClassNotFoundException{
		
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}
}

/*throws keyword is only for thechecked propogation. 
If we do not want to handle the exception in current method but want to handle this exception in calling method and 
it is necessary to keep either try catch in the calling statement or throws*/