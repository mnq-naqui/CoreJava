package mnq.naqui;

import java.io.*;

class Prime_check {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Limit:");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Prime numbers: ");

		for (int i = 1; i < num; i++) {
			int j ;
			for (j= 2; j < i; j++) {
				int n = i % j;
				if (n == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.print("  " + i);
			}
		}
	}
}
