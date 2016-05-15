package com.lara;

public class I{
	
		public static void main(String[] args) {
			
		
		
			String s1="Lara";
		String s2="Lara";
		String s3=new String("Lara");
		String s4=new String ("Lar");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("_______________________________");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println("_______________________________");
		
		System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s1.hashCode()==s3.hashCode());
		System.out.println(s1.hashCode()==s4.hashCode());
		
		System.out.println("_____________________________");
				System.out.println(s1.hashCode());
				System.out.println(s2.hashCode());
				System.out.println(s3.hashCode());
				System.out.println(s4.hashCode());
/*				hash code is generated on the basis of the content of 
				the String , since it is over rided in the String class.If 
				content is same then it is same if content is different then 
				hash code will be different*/
				
	}

}
