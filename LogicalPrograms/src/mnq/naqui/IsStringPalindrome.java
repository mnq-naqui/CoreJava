package mnq.naqui;

import java.util.Scanner;

public class IsStringPalindrome {
	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter String :");
		  String n=sc.nextLine();
		  String rev="";
		  boolean res=false;
		  int len=n.length();
		  for(int i=len-1;i>=0;i--)
		  {
		   rev=rev+n.charAt(i); 
		  
		}
		  /*
		   * another smple approach to check string is 
		   * palindrome or not
		   * if (n.equals(rev)) {
			  System.out.println("palindrom");
			
		}
		  else {
			System.out.println("not palindrome");
		}*/
		  
		    
		  
		  
		  for (int i = 0; i < len-1; i++) {
			 res=(  n.charAt(i)==rev.charAt(i));
		  } 
		  if (res) {
			System.out.println("The String you entered is palindrome");
		}else {
			System.out.println("The String you entered is not palindrome");
		}
	}
}
