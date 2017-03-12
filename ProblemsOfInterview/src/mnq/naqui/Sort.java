package mnq.naqui;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		Footballer f1 = new Footballer(28, "Lio", 500, 43.55);
		Footballer f2 = new Footballer(26, "Neymar", 250, 33.55);
		Footballer f3 = new Footballer(30, "Suarez", 400, 47.55);
		Footballer f4 = new Footballer(30, "Ronaldo", 500, 43.55);
		Footballer f5 = new Footballer(35, "Ibrahimovic", 449, 53.55);

		Footballer[] football = { f1, f2, f3, f4, f5 };
		/*
		 * Footballer[] football= new Footballer[5]; football [0]=f1; football
		 * [1]=f2;
		 */

		
		Arrays.sort(football, new Footballer.SortByGoal());
		printArray(football);
		
	}
	
	private static void printArray(Footballer[] football) {
		
		for (Footballer footballer : football) {
			//System.out.println(footballer.getName()+" "+footballer.getAge()+" "+ footballer.getGoalsScored()+" "+ footballer.getRange());
			System.out.println(footballer.getName());
		}

	}
}
