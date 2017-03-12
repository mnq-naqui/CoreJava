package mnq.naqui;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int num = 0;
		int revNum = 0;
		int temp = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		while (num > 0) {

			// use modulus operator to strip off the last digit
			temp = num % 10;

			// create the reversed number
			revNum = revNum * 10 + temp;
			System.out.println(temp);
			System.out.println(revNum);
			num = num / 10;

		}

		
		// output the reversed number
		System.out.println("Reversed Number is: " + revNum);
		
	}

}
