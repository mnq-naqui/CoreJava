//Program 232
package com.lara.equals;
class H{
	int i,j;
	H(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public boolean equals(Object obj) {
		 H myObj=(H)obj;
		
		return (i==myObj.i&&j==myObj.j);
	}
}
public class Manager7 {

	
	public static void main(String[] args) {
		H h1=new H(12,23);
		H h2=new H(12,23);
		
		System.out.println(h1.equals(h2));
	}

}
