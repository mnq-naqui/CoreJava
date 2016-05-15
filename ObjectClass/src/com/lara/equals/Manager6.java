package com.lara.equals;

class G {
	int i, j;

	G(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public boolean equals(Object obj) {
		G myObj=(G)obj;
		boolean flag=(i==myObj.i&&j==myObj.j);
		return flag;
	}
	
}

public class Manager6 {

	
	public static void main(String[] args) {
		G g1=new G(4,4);
		G g2=new G(4,4);
		System.out.println(g1.equals(g2));
		//System.out.println(g1==g2);

	}

}
