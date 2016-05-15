package com.lara;

public class G {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("asd");
		sb.append("zxc");
		System.out.println(sb);
		sb.delete(3, 6);
		System.out.println(sb);
	}

}
