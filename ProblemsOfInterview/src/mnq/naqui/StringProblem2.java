package mnq.naqui;/*
 Que if same character is coming consecutively three times then it is said to be
triple occured.Find the count of the that triple occured charccter.Obrserve the comment 
below to identify the condition*/
public class StringProblem2 {

	int counter ;
	public int tripleOccurence(String str) {
		if (str == null) {
			return 0;
		}
		for (int i = 0; i < (str.length() - 2); i++) {

			if ((str.charAt(i) == str.charAt(i + 1))&&
					(str.charAt(i+1) == str.charAt(i + 2))) {
				
				counter++;
				
			}
			
			
		}
		return counter;
	}

	public static void main(String[] args) {
		String s1 = "absssde";// here count is 1
		String s2 = "ayyysyyyyss";// here count is 3
		String s3="";
		StringProblem2 obj = new StringProblem2();
		int result = obj.tripleOccurence(s2);
		System.out.println(result);
	}

}
