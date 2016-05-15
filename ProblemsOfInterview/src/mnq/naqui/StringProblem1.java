package mnq.naqui;
/*Que is this you have to give the maximum count of the character occuring
in the three strings*/ 
public class StringProblem1 {

	int counter = 1;
	int previousCount;

	public int maxLong(String str) {
		if (str=="") {
			return 0;
		}
		for (int i = 0; i < (str.length() - 1); i++) {
			
			
			if (str.charAt(i) == str.charAt(i + 1)) {
				counter++;	 
				
			} 
			else {
				previousCount=counter;
				counter=1;
				
			}
			
			
		}
		if (previousCount > counter) {

			return previousCount;
		} else {
			return counter;
		}

	}

	public static void main(String[] args) {
		String s1 = "abcdaaccccbbb";
		String s2 = "wwxxxxxsstttttt";
		String s3 = "";
		StringProblem1 obj = new StringProblem1();
		int result = obj.maxLong(s1);
		System.out.println(result);
	}

}
