package com.lara;

public class H {

	public static void main(String[] args) {/*
 		There is no difference between String Buffer(jdk 1.4) and StringBuilder(jdk 1.5) incase 
 		of methods.The only difference is String Buffer is synchronized one but 
 		the stringBuilder is non-synchronized.*/
		
		StringBuilder sb =new StringBuilder();
		sb.append("asd");
		sb.append("zxc");
		sb.append("qwe");
		System.out.println(sb);
	}

}
